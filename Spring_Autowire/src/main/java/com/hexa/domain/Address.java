package com.hexa.domain;

public class Address {
	
	private int streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "streetNo--"+streetNo+"   area---"+area+"   city---"+city+"   state---"+state+"country---"+country;
	}
	
	public Address() {
		System.out.println("Address:0-param constructor");
	}

}
