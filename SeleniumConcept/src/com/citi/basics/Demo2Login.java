package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Login {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By loc= By.id("email");
		WebElement ele= driver.findElement(loc);
		ele.sendKeys("bala123@gmail.com");
		
		
//		driver.findElement(By.id("email")).sendKeys("bala12345@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
//		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}
}
