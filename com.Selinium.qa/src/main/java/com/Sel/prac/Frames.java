package com.Sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		//driver.switchTo().frame("frame-top");
		
		
		driver.switchTo().frame("frame-middle");
		
   System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
   
   driver.quit();
		

	}

}
