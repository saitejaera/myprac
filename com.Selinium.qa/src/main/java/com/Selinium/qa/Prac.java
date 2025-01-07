package com.Selinium.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Prac {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        
    String opt= driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getText();

  WebElement dropdown =  driver.findElement(By.id("dropdown-class-example"));    
  
    
      
      

		
	}

}
