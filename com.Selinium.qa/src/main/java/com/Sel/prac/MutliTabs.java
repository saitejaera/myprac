package com.Sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MutliTabs {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
		columndriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		

	}

}
