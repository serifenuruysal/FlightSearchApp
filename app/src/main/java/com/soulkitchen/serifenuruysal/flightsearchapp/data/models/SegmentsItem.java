package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class SegmentsItem{

	@SerializedName("Directionality")
	private String directionality;

	@SerializedName("OriginStation")
	private int originStation;

	@SerializedName("DepartureDateTime")
	private String departureDateTime;

	@SerializedName("ArrivalDateTime")
	private String arrivalDateTime;

	@SerializedName("JourneyMode")
	private String journeyMode;

	@SerializedName("DestinationStation")
	private int destinationStation;

	@SerializedName("OperatingCarrier")
	private int operatingCarrier;

	@SerializedName("FlightNumber")
	private String flightNumber;

	@SerializedName("Duration")
	private int duration;

	@SerializedName("Id")
	private int id;

	@SerializedName("Carrier")
	private int carrier;

	public void setDirectionality(String directionality){
		this.directionality = directionality;
	}

	public String getDirectionality(){
		return directionality;
	}

	public void setOriginStation(int originStation){
		this.originStation = originStation;
	}

	public int getOriginStation(){
		return originStation;
	}

	public void setDepartureDateTime(String departureDateTime){
		this.departureDateTime = departureDateTime;
	}

	public String getDepartureDateTime(){
		return departureDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime){
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getArrivalDateTime(){
		return arrivalDateTime;
	}

	public void setJourneyMode(String journeyMode){
		this.journeyMode = journeyMode;
	}

	public String getJourneyMode(){
		return journeyMode;
	}

	public void setDestinationStation(int destinationStation){
		this.destinationStation = destinationStation;
	}

	public int getDestinationStation(){
		return destinationStation;
	}

	public void setOperatingCarrier(int operatingCarrier){
		this.operatingCarrier = operatingCarrier;
	}

	public int getOperatingCarrier(){
		return operatingCarrier;
	}

	public void setFlightNumber(String flightNumber){
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber(){
		return flightNumber;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCarrier(int carrier){
		this.carrier = carrier;
	}

	public int getCarrier(){
		return carrier;
	}

	@Override
 	public String toString(){
		return 
			"SegmentsItem{" + 
			"directionality = '" + directionality + '\'' + 
			",originStation = '" + originStation + '\'' + 
			",departureDateTime = '" + departureDateTime + '\'' + 
			",arrivalDateTime = '" + arrivalDateTime + '\'' + 
			",journeyMode = '" + journeyMode + '\'' + 
			",destinationStation = '" + destinationStation + '\'' + 
			",operatingCarrier = '" + operatingCarrier + '\'' + 
			",flightNumber = '" + flightNumber + '\'' + 
			",duration = '" + duration + '\'' + 
			",id = '" + id + '\'' + 
			",carrier = '" + carrier + '\'' + 
			"}";
		}
}