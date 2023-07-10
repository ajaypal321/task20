package com.task.tewnty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//set the path a the chromediver
				System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
		// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				// time manage
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				// navigate to guvi
				driver.get("https://www.guvi.in/ ");
				// click on Login button
				WebElement Login=driver.findElement(By.xpath("(//a[contains(@class,'text-primary text-center px-4')])[1]"));
				Login.click();
				// Enter the Email
			WebElement email= driver.findElement(By.id("login_email"));
			email.sendKeys("ajaypal14497@gmail.com");
			// Enter the password
						WebElement password= driver.findElement(By.id("login_password"));
						password.sendKeys("Aj@yautomation23");
						// submit 
						WebElement submit = driver.findElement(By.id("login_button"));
						submit.click();
						//  logged  message
					      Thread.sleep(2000);
					      String Title = driver.getTitle();
					     // Title.contains("Online Courses"){
					      System.out.println("User is logged successfully" +" " +Title);

					      driver.close();
						
	}
}
// RESULT
/*
 * Jul 10, 2023 5:48:14 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
User is logged successfullyGUVI | courses
 * 
 * 
 */
