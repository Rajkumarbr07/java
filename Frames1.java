package org.tcs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement username1 = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=2']"));
		driver.switchTo().frame(username1);
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("Rajkumar");
		WebElement btn = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		btn.click();
	}



}
