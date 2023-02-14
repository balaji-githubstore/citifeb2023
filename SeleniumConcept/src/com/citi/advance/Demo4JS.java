package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4JS {

	public static void main(String[] args) {
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
//		driver.findElement(By.id("bill-date-long")).sendKeys("16/05/2007");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#bill-date-long').value='16/05/2007'");
	}
}
