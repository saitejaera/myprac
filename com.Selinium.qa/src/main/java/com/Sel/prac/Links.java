package com.Sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.ebay.com/");
		
		System.out.println("total number of links in page is" +" "+driver.findElements(By.tagName("a")).size());
		
		//Count of links in the footer section of the page
		
		WebElement foot = driver.findElement(By.cssSelector("div[id='vlGlobalFooter']"));
		
		System.out.println("number of links in footer page is" + " " +foot.findElements(By.tagName("a")).size());
		
		driver.quit();
		
		
		
		
		
		

	}

}
