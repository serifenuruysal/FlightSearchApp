package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class FlightNumbersItem{

	@SerializedName("CarrierId")
	private int carrierId;

	@SerializedName("FlightNumber")
	private String flightNumber;

	public void setCarrierId(int carrierId){
		this.carrierId = carrierId;
	}

	public int getCarrierId(){
		return carrierId;
	}

	public void setFlightNumber(String flightNumber){
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber(){
		return flightNumber;
	}

	@Override
 	public String toString(){
		return 
			"FlightNumbersItem{" + 
			"carrierId = '" + carrierId + '\'' + 
			",flightNumber = '" + flightNumber + '\'' + 
			"}";
		}
}