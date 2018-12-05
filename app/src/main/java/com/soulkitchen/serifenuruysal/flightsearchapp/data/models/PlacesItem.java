package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import com.google.gson.annotations.SerializedName;

public class PlacesItem{

	@SerializedName("ParentId")
	private int parentId;

	@SerializedName("Type")
	private String type;

	@SerializedName("Id")
	private int id;

	@SerializedName("Code")
	private String code;

	@SerializedName("Name")
	private String name;

	public void setParentId(int parentId){
		this.parentId = parentId;
	}

	public int getParentId(){
		return parentId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
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

	@Override
 	public String toString(){
		return 
			"PlacesItem{" + 
			"parentId = '" + parentId + '\'' + 
			",type = '" + type + '\'' + 
			",id = '" + id + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}