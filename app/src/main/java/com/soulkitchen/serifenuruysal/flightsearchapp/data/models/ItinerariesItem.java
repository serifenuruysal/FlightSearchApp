package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItinerariesItem{

	@SerializedName("InboundLegId")
	private String inboundLegId;

	@SerializedName("BookingDetailsLink")
	private BookingDetailsLink bookingDetailsLink;

	@SerializedName("OutboundLegId")
	private String outboundLegId;

	@SerializedName("PricingOptions")
	private List<PricingOptionsItem> pricingOptions;

	public void setInboundLegId(String inboundLegId){
		this.inboundLegId = inboundLegId;
	}

	public String getInboundLegId(){
		return inboundLegId;
	}

	public void setBookingDetailsLink(BookingDetailsLink bookingDetailsLink){
		this.bookingDetailsLink = bookingDetailsLink;
	}

	public BookingDetailsLink getBookingDetailsLink(){
		return bookingDetailsLink;
	}

	public void setOutboundLegId(String outboundLegId){
		this.outboundLegId = outboundLegId;
	}

	public String getOutboundLegId(){
		return outboundLegId;
	}

	public void setPricingOptions(List<PricingOptionsItem> pricingOptions){
		this.pricingOptions = pricingOptions;
	}

	public List<PricingOptionsItem> getPricingOptions(){
		return pricingOptions;
	}

	@Override
 	public String toString(){
		return 
			"ItinerariesItem{" + 
			"inboundLegId = '" + inboundLegId + '\'' + 
			",bookingDetailsLink = '" + bookingDetailsLink + '\'' + 
			",outboundLegId = '" + outboundLegId + '\'' + 
			",pricingOptions = '" + pricingOptions + '\'' + 
			"}";
		}
}