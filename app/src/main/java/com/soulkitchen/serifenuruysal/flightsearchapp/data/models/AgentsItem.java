package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class AgentsItem{

	@SerializedName("Status")
	private String status;

	@SerializedName("Type")
	private String type;

	@SerializedName("ImageUrl")
	private String imageUrl;

	@SerializedName("Id")
	private int id;

	@SerializedName("OptimisedForMobile")
	private boolean optimisedForMobile;

	@SerializedName("Name")
	private String name;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

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

	public void setOptimisedForMobile(boolean optimisedForMobile){
		this.optimisedForMobile = optimisedForMobile;
	}

	public boolean isOptimisedForMobile(){
		return optimisedForMobile;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"AgentsItem{" + 
			"status = '" + status + '\'' + 
			",type = '" + type + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",id = '" + id + '\'' + 
			",optimisedForMobile = '" + optimisedForMobile + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}