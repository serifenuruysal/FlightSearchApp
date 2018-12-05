package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SkyResponse{

	@SerializedName("Status")
	private String status;

	@SerializedName("Carriers")
	private List<CarriersItem> carriers;

	@SerializedName("Legs")
	private List<LegsItem> legs;

	@SerializedName("Itineraries")
	private List<ItinerariesItem> itineraries;

	@SerializedName("Query")
	private Query query;

	@SerializedName("SessionKey")
	private String sessionKey;

	@SerializedName("Agents")
	private List<AgentsItem> agents;

	@SerializedName("Segments")
	private List<SegmentsItem> segments;

	@SerializedName("Currencies")
	private List<CurrenciesItem> currencies;

	@SerializedName("Places")
	private List<PlacesItem> places;

	@SerializedName("ServiceQuery")
	private ServiceQuery serviceQuery;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setCarriers(List<CarriersItem> carriers){
		this.carriers = carriers;
	}

	public List<CarriersItem> getCarriers(){
		return carriers;
	}

	public void setLegs(List<LegsItem> legs){
		this.legs = legs;
	}

	public List<LegsItem> getLegs(){
		return legs;
	}

	public void setItineraries(List<ItinerariesItem> itineraries){
		this.itineraries = itineraries;
	}

	public List<ItinerariesItem> getItineraries(){
		return itineraries;
	}

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	public void setSessionKey(String sessionKey){
		this.sessionKey = sessionKey;
	}

	public String getSessionKey(){
		return sessionKey;
	}

	public void setAgents(List<AgentsItem> agents){
		this.agents = agents;
	}

	public List<AgentsItem> getAgents(){
		return agents;
	}

	public void setSegments(List<SegmentsItem> segments){
		this.segments = segments;
	}

	public List<SegmentsItem> getSegments(){
		return segments;
	}

	public void setCurrencies(List<CurrenciesItem> currencies){
		this.currencies = currencies;
	}

	public List<CurrenciesItem> getCurrencies(){
		return currencies;
	}

	public void setPlaces(List<PlacesItem> places){
		this.places = places;
	}

	public List<PlacesItem> getPlaces(){
		return places;
	}

	public void setServiceQuery(ServiceQuery serviceQuery){
		this.serviceQuery = serviceQuery;
	}

	public ServiceQuery getServiceQuery(){
		return serviceQuery;
	}

	@Override
 	public String toString(){
		return 
			"SkyResponse{" + 
			"status = '" + status + '\'' + 
			",carriers = '" + carriers + '\'' + 
			",legs = '" + legs + '\'' + 
			",itineraries = '" + itineraries + '\'' + 
			",query = '" + query + '\'' + 
			",sessionKey = '" + sessionKey + '\'' + 
			",agents = '" + agents + '\'' + 
			",segments = '" + segments + '\'' + 
			",currencies = '" + currencies + '\'' + 
			",places = '" + places + '\'' + 
			",serviceQuery = '" + serviceQuery + '\'' + 
			"}";
		}
}