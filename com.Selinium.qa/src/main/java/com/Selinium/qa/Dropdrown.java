package com.Selinium.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Dropdrown {

	public static void main(String[] args) throws InterruptedException {
		
//System.setProperty("webdriver.chrome.driver","C:\\Users\\saite\\Documents\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\saite\\Documents\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
 
   driver.manage().window().maximize();
  
 WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    
    Select dropdown = new Select(StaticDropdown);
    
    dropdown.selectByIndex(1);
    
    System.out.println(dropdown.getFirstSelectedOption().getText());
    
    dropdown.selectByValue("AED");
    System.out.println(dropdown.getFirstSelectedOption().getText());
    dropdown.selectByVisibleText("USD");
    
    System.out.println(dropdown.getFirstSelectedOption());  
   
   driver.findElement(By.id("divpaxinfo")).click();
   
   Thread.sleep(2000);
   
   for(int i=1;i<5;i++) {
	   
	   driver.findElement(By.id("hrefIncAdt")).click();
	   
   }
   
   driver.findElement(By.id("btnclosepaxoption")).click();
  
   driver.findElement(By.id("divpaxinfo")).getText();
   
   
    
    driver.close();
		

		
		
		
	    
	    
	    
	    
	    
	   
	    
	    
	 
	 
	 
	 

	}

}
