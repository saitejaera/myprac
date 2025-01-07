package com.Sel.prac;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practise {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

		Set<String> win = driver.getWindowHandles();

		Iterator<String> itr = win.iterator();

		String Parentid = itr.next();
		String childid = itr.next();

		driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		driver.switchTo().window(Parentid);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().defaultContent();

		driver.quit();

	}

}
