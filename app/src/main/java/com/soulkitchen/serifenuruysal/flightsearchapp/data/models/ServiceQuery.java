package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class ServiceQuery{

	@SerializedName("DateTime")
	private String dateTime;

	public void setDateTime(String dateTime){
		this.dateTime = dateTime;
	}

	public String getDateTime(){
		return dateTime;
	}

	@Override
 	public String toString(){
		return 
			"ServiceQuery{" + 
			"dateTime = '" + dateTime + '\'' + 
			"}";
		}
}