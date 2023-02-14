package com.citi.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//not actually an alert 
public class Demo2Alert {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
	}
}
