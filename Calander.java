package com.task.tewnty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) {
		//set the path a the chromediver
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
// instance of chromedriver 
		WebDriver driver = new ChromeDriver();
		// time manage
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// navigate to facebook
		driver.get("https://jqueryui.com/datepicker/");
		// switch to i-frame
		driver.switchTo().frame(0);
		WebElement datapicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datapicker.click();
		// next month
		WebElement next = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		next.click();
		// date selection
		WebElement currentDate = driver.findElement(By.cssSelector("a[data-date='22']"));
             currentDate.click();
             // print date
             String date = currentDate.getText();
             System.out.println("Selected date"+date);
             driver.quit();
	}

}

// Result
/*
 * Jul 10, 2023 3:14:26 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Selected date22

 * 
 */

