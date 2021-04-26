package com.spring.Spring.core;

public class Employee {
	
	private int id;
	private String name;
	private Adress adress;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAdress(Adress adress)
	{
		this.adress=adress;
	}
	public Adress getAdress()
	{
		return adress;
	}
	
	public String toString()
	{
		return "Employee[Id : "+id+", Name : "+name+", Adress :"+adress+"]";
	}

}
