package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class BookingDetailsLink{

	@SerializedName("Method")
	private String method;

	@SerializedName("Uri")
	private String uri;

	@SerializedName("Body")
	private String body;

	public void setMethod(String method){
		this.method = method;
	}

	public String getMethod(){
		return method;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	@Override
 	public String toString(){
		return 
			"BookingDetailsLink{" + 
			"method = '" + method + '\'' + 
			",uri = '" + uri + '\'' + 
			",body = '" + body + '\'' + 
			"}";
		}
}