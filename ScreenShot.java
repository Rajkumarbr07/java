package org.tcs;

import java.io.File;

import java.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.moneycontrol.com/markets/fno-market-snaphot");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.id("mc_mainWrapper"));
	TakesScreenshot screenshot=(TakesScreenshot)driver;
File screen = screenshot.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\Screenshot\\output.png");
	FileUtils   
	}

}
