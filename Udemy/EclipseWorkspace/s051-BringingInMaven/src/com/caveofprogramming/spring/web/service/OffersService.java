package com.caveofprogramming.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDao;

@Service("offersService")
public class OffersService {

	private OffersDao offersDAO;

	public List<Offer> getCurrent() {
		return offersDAO.getOffers();
	}

	@Autowired
	public void setOffersDAO(OffersDao offersDAO) {
		this.offersDAO = offersDAO;
	}

	@Secured({"ROLE_USER", "ROLE_ADMIN"})
	public void create(Offer offer) {
		offersDAO.create(offer);
	}

	public boolean hasOffer(String name) {
		if(name == null){
			return false;
		}
		
		List<Offer> offers = offersDAO.getOffers(name);
		if(offers.size() == 0){
			return false; 
		}
		
		return true;
	}

	public Offer getOffer(String username) {
		if(username == null){
			return null;
		}
		List<Offer> offers = offersDAO.getOffers(username);
		
		if(offers.size() == 0){
			return null;
		}
		return offers.get(0);
	}

	public void saveOrUpdate(Offer offer) {
		if(offer.getId() != 0){
			offersDAO.update(offer);
		} else {
			offersDAO.create(offer);
		}
	} 

}