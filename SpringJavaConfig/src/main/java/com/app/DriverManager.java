package com.app;


public class DriverManager 
{
	private String driverClass;
	private String driverUrl;
	
	public DriverManager() {
		super();
		
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getDriverUrl() {
		return driverUrl;
	}

	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}

	@Override
	public String toString() {
		return "DriverManager [driverClass=" + driverClass + ", driverUrl=" + driverUrl + "]";
	}
	
	
	
	

}
