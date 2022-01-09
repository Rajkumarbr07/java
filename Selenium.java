package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
public static void main(String[] args) throws InterruptedException, AWTException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("Rajalakshmi");
//	WebElement password = driver.findElement(By.name("pass"));
//	password.sendKeys("Amma");
	Thread.sleep(2000);
//	Actions a=new Actions(driver);
//	a.doubleClick(username).perform();
//	Thread.sleep(2000);
//	a.contextClick(password).perform();
//	Thread.sleep(2000);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);

	
	
}
}
