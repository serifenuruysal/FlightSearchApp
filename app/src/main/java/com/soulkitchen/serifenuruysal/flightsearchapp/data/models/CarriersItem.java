package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class CarriersItem{

	@SerializedName("ImageUrl")
	private String imageUrl;

	@SerializedName("Id")
	private int id;

	@SerializedName("Code")
	private String code;

	@SerializedName("Name")
	private String name;

	@SerializedName("DisplayCode")
	private String displayCode;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDisplayCode(String displayCode){
		this.displayCode = displayCode;
	}

	public String getDisplayCode(){
		return displayCode;
	}

	@Override
 	public String toString(){
		return 
			"CarriersItem{" + 
			"imageUrl = '" + imageUrl + '\'' + 
			",id = '" + id + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",displayCode = '" + displayCode + '\'' + 
			"}";
		}
}