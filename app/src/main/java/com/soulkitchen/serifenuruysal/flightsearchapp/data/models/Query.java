package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class Query{

	@SerializedName("Locale")
	private String locale;

	@SerializedName("LocationSchema")
	private String locationSchema;

	@SerializedName("Infants")
	private int infants;

	@SerializedName("InboundDate")
	private String inboundDate;

	@SerializedName("OriginPlace")
	private String originPlace;

	@SerializedName("CabinClass")
	private String cabinClass;

	@SerializedName("Currency")
	private String currency;

	@SerializedName("GroupPricing")
	private boolean groupPricing;

	@SerializedName("Country")
	private String country;

	@SerializedName("Adults")
	private int adults;

	@SerializedName("Children")
	private int children;

	@SerializedName("OutboundDate")
	private String outboundDate;

	@SerializedName("DestinationPlace")
	private String destinationPlace;

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setLocationSchema(String locationSchema){
		this.locationSchema = locationSchema;
	}

	public String getLocationSchema(){
		return locationSchema;
	}

	public void setInfants(int infants){
		this.infants = infants;
	}

	public int getInfants(){
		return infants;
	}

	public void setInboundDate(String inboundDate){
		this.inboundDate = inboundDate;
	}

	public String getInboundDate(){
		return inboundDate;
	}

	public void setOriginPlace(String originPlace){
		this.originPlace = originPlace;
	}

	public String getOriginPlace(){
		return originPlace;
	}

	public void setCabinClass(String cabinClass){
		this.cabinClass = cabinClass;
	}

	public String getCabinClass(){
		return cabinClass;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setGroupPricing(boolean groupPricing){
		this.groupPricing = groupPricing;
	}

	public boolean isGroupPricing(){
		return groupPricing;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAdults(int adults){
		this.adults = adults;
	}

	public int getAdults(){
		return adults;
	}

	public void setChildren(int children){
		this.children = children;
	}

	public int getChildren(){
		return children;
	}

	public void setOutboundDate(String outboundDate){
		this.outboundDate = outboundDate;
	}

	public String getOutboundDate(){
		return outboundDate;
	}

	public void setDestinationPlace(String destinationPlace){
		this.destinationPlace = destinationPlace;
	}

	public String getDestinationPlace(){
		return destinationPlace;
	}

	@Override
 	public String toString(){
		return 
			"Query{" + 
			"locale = '" + locale + '\'' + 
			",locationSchema = '" + locationSchema + '\'' + 
			",infants = '" + infants + '\'' + 
			",inboundDate = '" + inboundDate + '\'' + 
			",originPlace = '" + originPlace + '\'' + 
			",cabinClass = '" + cabinClass + '\'' + 
			",currency = '" + currency + '\'' + 
			",groupPricing = '" + groupPricing + '\'' + 
			",country = '" + country + '\'' + 
			",adults = '" + adults + '\'' + 
			",children = '" + children + '\'' + 
			",outboundDate = '" + outboundDate + '\'' + 
			",destinationPlace = '" + destinationPlace + '\'' + 
			"}";
		}
}