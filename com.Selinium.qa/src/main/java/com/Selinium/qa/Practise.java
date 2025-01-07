package com.Selinium.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {
	
	public static void main( String args[]){
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\saite\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());  */
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	
		driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("munna");
		driver.findElement(By.name("name")).sendKeys("munna");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("munnasingh1919@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("munna123");
		driver.findElement(By.id("exampleCheck1")).click();
	WebElement Sdropdown = 	driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
                  Select dropdown = new Select (Sdropdown);
                  
                  dropdown.selectByVisibleText("Male");
                  
                  driver.findElement(By.id("inlineRadio2")).click();
                  
                  driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("24101995");
                  driver.findElement(By.cssSelector("input[value='Submit']")).click();
                  
            System.out.println( driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());    
            
           
                  
                  
                  	driver.close();
		
		
		
		
	}

}
