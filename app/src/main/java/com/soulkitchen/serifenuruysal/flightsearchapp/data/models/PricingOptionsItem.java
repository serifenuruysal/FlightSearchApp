package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PricingOptionsItem{

	@SerializedName("DeeplinkUrl")
	private String deeplinkUrl;

	@SerializedName("Price")
	private double price;

	@SerializedName("Agents")
	private List<Integer> agents;

	@SerializedName("QuoteAgeInMinutes")
	private int quoteAgeInMinutes;

	public void setDeeplinkUrl(String deeplinkUrl){
		this.deeplinkUrl = deeplinkUrl;
	}

	public String getDeeplinkUrl(){
		return deeplinkUrl;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setAgents(List<Integer> agents){
		this.agents = agents;
	}

	public List<Integer> getAgents(){
		return agents;
	}

	public void setQuoteAgeInMinutes(int quoteAgeInMinutes){
		this.quoteAgeInMinutes = quoteAgeInMinutes;
	}

	public int getQuoteAgeInMinutes(){
		return quoteAgeInMinutes;
	}

	@Override
 	public String toString(){
		return 
			"PricingOptionsItem{" + 
			"deeplinkUrl = '" + deeplinkUrl + '\'' + 
			",price = '" + price + '\'' + 
			",agents = '" + agents + '\'' + 
			",quoteAgeInMinutes = '" + quoteAgeInMinutes + '\'' + 
			"}";
		}
}