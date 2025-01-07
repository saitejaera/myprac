package com.Selinium.qa;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\saite\\Documents\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']")));
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();

		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));

		Select dd1 = new Select(dropdown);

		dd1.selectByValue("consult");

		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();

		List<WebElement> options = driver.findElements(By.xpath("button[class='btn btn-info']"));

		for (int i = 0; i < options.size(); i++) {

			options.get(i).click();

		}

		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();

		driver.findElement(By.cssSelector("button.btn.btn-success")).click();

		driver.findElement(By.cssSelector("input[id='country'] ")).sendKeys("500016");

		driver.findElement(By.cssSelector("label[for='checkbox2']")).click();

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		System.out.println(
				driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

		driver.quit();

	}

}
