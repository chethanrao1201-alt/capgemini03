package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class OverseasProduct{
	private String country;
	private double price;
	public OverseasProduct(String country, double price) {
		super();
		this.country = country;
		this.price = price;
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class Products {

	public static void main(String[] args) {
		List <OverseasProduct> p=Arrays.asList(new OverseasProduct("UK",15000),
				                               new OverseasProduct("US",10000),
				                               new OverseasProduct("China",2000),
				                               new OverseasProduct("SA",12000),
				                               new OverseasProduct("India",25000));
		p.stream().filter(p1->p1.getPrice()<5000).forEach(p1->System.out.println(p1.getPrice()+" "+p1.getCountry()));
				                  			                      
	}
}
				