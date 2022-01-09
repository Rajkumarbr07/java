package org.tcs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone",Keys.ENTER);
	WebElement iphone13 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB) - Midnight']"));
	iphone13.click();
	String par = driver.getWindowHandle();
	System.out.println(par);
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	for (String x : all) {
		if (!par.equals(x)) {
			driver.switchTo().window(x);
		}
		 driver.switchTo().window(par);
	}

}
}
