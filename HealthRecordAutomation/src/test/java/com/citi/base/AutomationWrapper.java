package com.citi.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationWrapper {
	
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		String browserName="edge";
		
		if(browserName.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.openemr.io/b/openemr/index.php");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
