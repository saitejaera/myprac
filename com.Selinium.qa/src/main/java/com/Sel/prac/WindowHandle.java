package com.Sel.prac;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
	    Set<String> win=	driver.getWindowHandles();
	     
	     Iterator<String> it = win.iterator();
	     
	     String parentid = it.next();
	     String childid = it.next();
	     
	     driver.switchTo().window(childid); 
	     
	   System.out.println( driver.findElement(By.cssSelector(".im-para.red")).getText());
	     
	     
	     
	String emailid =   driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	     
	System.out.println(emailid);

	 System.out.println(driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText());
	 
	 driver.switchTo().window(parentid);
	 
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys(emailid);
               
	driver.quit();
	}

}
