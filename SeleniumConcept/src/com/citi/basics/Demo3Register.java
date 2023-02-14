package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3Register {

	public static void main(String[] args)  {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete 
		
		driver.findElement(By.linkText("Create new account")).click(); //will check for presence of element in 0.5sec
		
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//20 Dec 1999
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("1999");
		
		//click on custom radio button 
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		 
	}

}
