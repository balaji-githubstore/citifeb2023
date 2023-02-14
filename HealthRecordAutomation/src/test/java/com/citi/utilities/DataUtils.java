package com.citi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
//	@DataProvider
//	public Object[][] validLoginData()
//	{
//		Object[][] data=new Object[2][3];
//		
//		data[0][0]="accountant";
//		data[0][1]="accountant";
//		data[0][2]="OpenEMR";
//		
//		data[1][0]="physician";
//		data[1][1]="physician";
//		data[1][2]="OpenEMR";
//		
//		return data;
//	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//gives the @Test method name - that is sheet name 
		String testMethodName=method.getName();
		
		Object[][] data= ExcelUtils.getSheetIntoTwoDimArray("testdata/openemr_data.xlsx", testMethodName);
		return data;
	}
	

}
