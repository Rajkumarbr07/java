package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();

WebElement element = driver.findElement(By.id("menu-item-5419"));


Actions a=new Actions(driver);

a.moveToElement(element).perform();
}


}
