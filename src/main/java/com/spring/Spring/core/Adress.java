package com.spring.Spring.core;

public class Adress {
	
	private String city;
	private String state;
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	
	public String toString()
	{
		return "[City : "+city+", State : "+state+"]";
	}

}
