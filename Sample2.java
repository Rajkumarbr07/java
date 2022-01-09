package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement element = driver.findElement(By.id("Skills"));
	Select select=new Select(element);
	List<WebElement> options = select.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement element2 = options.get(i);
		String text = element2.getText();
		System.out.println(text);
		
	}
	
	
	
	}

}
