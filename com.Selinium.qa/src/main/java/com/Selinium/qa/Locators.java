package com.Selinium.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saite\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/");
		
		Thread.sleep(2000);
		
		
        driver.findElement(By.xpath("//div[@class='top-right clearfix']//div[2]")).click();
        //driver.findElement(By.linkText("Login")).click();
        
       driver.findElement(By.cssSelector(("#email"))).sendKeys("munnasingh1919@gmail.com");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("munna123");
       
      driver.findElement(By.xpath("//input[@name='commit']")).click();
      
      driver.close();
      
          driver.quit();
          
		


	}

}
