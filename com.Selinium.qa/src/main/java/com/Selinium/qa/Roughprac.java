package com.Selinium.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Roughprac {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","C:\\Users\\saite\\Documents\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		String  text ="munna" ;
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
	
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		driver.quit();
		
		

	}

}
