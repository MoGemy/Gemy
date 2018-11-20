package com.example.gemy.test.POJO;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Studentlist{

	@SerializedName("msg")
	private String msg;

	@SerializedName("month")
	private String month;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("basic_work_hours")
	private int basicWorkHours;

	@SerializedName("name")
	private String name;

	@SerializedName("error")
	private boolean error;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setMonth(String month){
		this.month = month;
	}

	public String getMonth(){
		return month;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setBasicWorkHours(int basicWorkHours){
		this.basicWorkHours = basicWorkHours;
	}

	public int getBasicWorkHours(){
		return basicWorkHours;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	@Override
 	public String toString(){
		return 
			"Studentlist{" + 
			"msg = '" + msg + '\'' + 
			",month = '" + month + '\'' + 
			",data = '" + data + '\'' + 
			",basic_work_hours = '" + basicWorkHours + '\'' + 
			",name = '" + name + '\'' + 
			",error = '" + error + '\'' + 
			"}";
		}
}