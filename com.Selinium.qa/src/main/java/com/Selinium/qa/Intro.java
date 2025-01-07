package com.Selinium.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Intro {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saite\\Documents\\chromedriver.exe");
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\saite\\Documents\\msedgedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}

}
