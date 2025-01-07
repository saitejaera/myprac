package com.Selinium.qa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2e {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			System.out.println(option.getText());
		}

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[value='HYD']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'][normalize-space()='Bengaluru (BLR)'])[2]")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("it is disabled");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);

		}

		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

		WebElement doptions = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select doption = new Select(doptions);

		doption.selectByValue("INR");

		System.out.println(doption.getFirstSelectedOption().getText());
		
		//driver.findElement(By.id("input[id='ctl00_mainContent_btn_FindFlights']")).click();
	
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		driver.close();

		driver.quit();

	}

}
