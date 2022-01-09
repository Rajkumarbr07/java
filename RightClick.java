package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("java selenium in chennai", Keys.ENTER);
		WebElement selenium = driver.findElement(By.xpath("//h3[text()='Selenium Certification Courses - Best IT Training Institutes in ...']"));
		selenium.click();
		WebElement course = driver.findElement(By.className("header-browse-greens"));
		Actions actions=new Actions(driver);
actions.moveToElement(course).perform();
	}
}
