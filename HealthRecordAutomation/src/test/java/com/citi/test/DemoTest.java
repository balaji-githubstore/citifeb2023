package com.citi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//no need to create
public class DemoTest {
	
	@DataProvider
	public String[][] validData()
	{
		String[][] data=new String[3][2];
		//i-> number of test cases
		//j-> number of parameters 
		data[0][0]="kim";
		data[0][1]="kim123";
		
		data[1][0]="saul";
		data[1][1]="saul123";
		
		data[2][0]="john";
		data[2][1]="john123";
		
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validTest(String username,String password) 
	{
		System.out.println("valid"+username+password);
	}

}
