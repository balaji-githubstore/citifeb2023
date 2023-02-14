package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.db4free.net/");

		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		//enter password as test123 
		//click on login
		
		driver.quit();
	}

}
