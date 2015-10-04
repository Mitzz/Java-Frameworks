package com.caveofprogramming.spring.web.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;

@Controller
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id) {
		System.out.println("Id is: " + id);
		return "home";
	}
	
	

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model, Principal principal){
		Offer offer = null;
		if(principal != null){
			String username = principal.getName();
			offer = offersService.getOffer(username);
		}
		
		if(offer == null){
			offer = new Offer();
		}
		
		model.addAttribute("offer", offer);
		return "createoffer";
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model,@Valid Offer offer, BindingResult result, Principal principal,@RequestParam(value="delete", required=false) String delete){
		if (result.hasErrors()) {
			return "createoffer";
		}
		
		if(delete == null) {
			String username = principal.getName();
			offer.getUser().setUsername(username);
			offersService.saveOrUpdate(offer);
			return "offercreated";
		}
		else {
			offersService.delete(offer.getId());
			return "offerdeleted";
		}
	}
}
