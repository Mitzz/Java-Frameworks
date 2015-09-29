package com.caveofprogramming.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {

	private OffersDAO offersDAO;

	public List<Offer> getCurrent() {
		return offersDAO.getOffers();
	}

	@Autowired
	public void setOffersDAO(OffersDAO offersDAO) {
		this.offersDAO = offersDAO;
	}

	public void create(Offer offer) {
		offersDAO.create(offer);
	}

	public void throwTestExcpetion() {
		offersDAO.getOffer(-1);
		
	}

}
