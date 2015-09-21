package com.caveofprogramming.spring.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class OffersDAO {
	
	private JdbcTemplate jdbc;
	
	public void setDataSource(DataSource jdbc){
		this.jdbc = new JdbcTemplate(jdbc);
	}
	
	public List<Offer> getOffers() {
		return null;
	}
}
