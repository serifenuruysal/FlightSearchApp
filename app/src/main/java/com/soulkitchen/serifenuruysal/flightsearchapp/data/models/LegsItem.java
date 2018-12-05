package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LegsItem{

	@SerializedName("SegmentIds")
	private List<Integer> segmentIds;

	@SerializedName("Duration")
	private int duration;

	@SerializedName("Arrival")
	private String arrival;

	@SerializedName("Carriers")
	private List<Integer> carriers;

	@SerializedName("Directionality")
	private String directionality;

	@SerializedName("OriginStation")
	private int originStation;

	@SerializedName("Departure")
	private String departure;

	@SerializedName("FlightNumbers")
	private List<FlightNumbersItem> flightNumbers;

	@SerializedName("JourneyMode")
	private String journeyMode;

	@SerializedName("DestinationStation")
	private int destinationStation;

	@SerializedName("Stops")
	private List<Object> stops;

	@SerializedName("OperatingCarriers")
	private List<Integer> operatingCarriers;

	@SerializedName("Id")
	private String id;

	public void setSegmentIds(List<Integer> segmentIds){
		this.segmentIds = segmentIds;
	}

	public List<Integer> getSegmentIds(){
		return segmentIds;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setArrival(String arrival){
		this.arrival = arrival;
	}

	public String getArrival(){
		return arrival;
	}

	public void setCarriers(List<Integer> carriers){
		this.carriers = carriers;
	}

	public List<Integer> getCarriers(){
		return carriers;
	}

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

	public void setDeparture(String departure){
		this.departure = departure;
	}

	public String getDeparture(){
		return departure;
	}

	public void setFlightNumbers(List<FlightNumbersItem> flightNumbers){
		this.flightNumbers = flightNumbers;
	}

	public List<FlightNumbersItem> getFlightNumbers(){
		return flightNumbers;
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

	public void setStops(List<Object> stops){
		this.stops = stops;
	}

	public List<Object> getStops(){
		return stops;
	}

	public void setOperatingCarriers(List<Integer> operatingCarriers){
		this.operatingCarriers = operatingCarriers;
	}

	public List<Integer> getOperatingCarriers(){
		return operatingCarriers;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"LegsItem{" + 
			"segmentIds = '" + segmentIds + '\'' + 
			",duration = '" + duration + '\'' + 
			",arrival = '" + arrival + '\'' + 
			",carriers = '" + carriers + '\'' + 
			",directionality = '" + directionality + '\'' + 
			",originStation = '" + originStation + '\'' + 
			",departure = '" + departure + '\'' + 
			",flightNumbers = '" + flightNumbers + '\'' + 
			",journeyMode = '" + journeyMode + '\'' + 
			",destinationStation = '" + destinationStation + '\'' + 
			",stops = '" + stops + '\'' + 
			",operatingCarriers = '" + operatingCarriers + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}