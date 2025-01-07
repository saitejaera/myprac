package com.Sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoveractions {

	public static void main(String[] args) {
		
	   
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		
		
		a.moveToElement(driver.findElement(By.cssSelector("div.nav-search-field"))).click().keyDown(Keys.SHIFT).sendKeys("mobiles").build().perform();
		
		
	   driver.quit();
	   
	}

}
