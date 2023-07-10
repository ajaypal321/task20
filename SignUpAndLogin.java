package com.task.tewnty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpAndLogin {

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
		// click on Sign Up button
		WebElement button=driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']"));
		button.click();
		//Actions actions = new Actions(driver);
		Thread.sleep(3000);
		// first Name
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("Test");
		// last name
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("automation");
		// email
		
		WebElement email =driver.findElement(By.id("emailInput"));
	email.sendKeys("automation1@gmail.com");
	// password
	WebElement password = driver.findElement(By.id("passwordInput"));
    password.sendKeys("Test@12345");
 // number
 	WebElement number = driver.findElement(By.id("mobileNumberInput"));
     number.sendKeys("9988774455");
     // signUp button
  // number
  	WebElement signup = driver.findElement(By.id("signup"));
      signup.click();
      // get the welcome message
      Thread.sleep(2000);
      String wel = signup.getText();
      System.out.println("User is registered successfully" + wel);
	}

}
// result
/*Jul 10, 2023 4:56:20 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
User is registered successfullySign up
 * 
 * 
 */

