package com.example.gemy.test.POJO;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("attend_date")
	private String attendDate;

	@SerializedName("leave_time")
	private String leaveTime;

	@SerializedName("attend_time")
	private String attendTime;

	@SerializedName("leave_date")
	private String leaveDate;

	public void setAttendDate(String attendDate){
		this.attendDate = attendDate;
	}

	public String getAttendDate(){
		return attendDate;
	}

	public void setLeaveTime(String leaveTime){
		this.leaveTime = leaveTime;
	}

	public String getLeaveTime(){
		return leaveTime;
	}

	public void setAttendTime(String attendTime){
		this.attendTime = attendTime;
	}

	public String getAttendTime(){
		return attendTime;
	}

	public void setLeaveDate(String leaveDate){
		this.leaveDate = leaveDate;
	}

	public String getLeaveDate(){
		return leaveDate;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"attend_date = '" + attendDate + '\'' + 
			",leave_time = '" + leaveTime + '\'' + 
			",attend_time = '" + attendTime + '\'' + 
			",leave_date = '" + leaveDate + '\'' + 
			"}";
		}
}