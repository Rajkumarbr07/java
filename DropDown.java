package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJKUMAR B\\eclipse-workspace\\Day1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Aruldeva");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("16041995");
	WebElement login = driver.findElement(By.id("login"));
login.click();
WebElement location = driver.findElement(By.id("location"));
Select Select =new Select(location);
Select.selectByIndex(1);
WebElement hotel = driver.findElement(By.id("hotels"));
Select Select1 =new Select(hotel);
Select1.selectByIndex(1);
WebElement roomtype = driver.findElement(By.id("room_type"));
Select Select2 =new Select(roomtype);
Select2.selectByIndex(2);
WebElement norooms = driver.findElement(By.id("room_nos"));
Select Select3 =new Select(norooms);
Select3.selectByIndex(3);
WebElement chkin= driver.findElement(By.id("datepick_in"));
chkin.sendKeys("23/12/2021");
WebElement chkout= driver.findElement(By.id("datepick_out"));
chkout.sendKeys("24/12/2021");
WebElement adlt = driver.findElement(By.id("adult_room"));
Select Select4 =new Select(adlt);
Select4.selectByIndex(3);
WebElement child = driver.findElement(By.id("child_room"));
Select Select5 =new Select(child);
Select5.selectByIndex(3);
WebElement search = driver.findElement(By.id("Submit"));
search.click();
WebElement btn = driver.findElement(By.id("radiobutton_0"));
btn.click();
WebElement con = driver.findElement(By.id("continue"));
con.click();
WebElement firstname= driver.findElement(By.id("first_name"));
firstname.sendKeys("Rajkumar");
WebElement lastname= driver.findElement(By.id("last_name"));
lastname.sendKeys("Rajkumar");
WebElement adrs= driver.findElement(By.id("address"));
adrs.sendKeys("Rajkumar");
WebElement crdno= driver.findElement(By.id("cc_num"));
crdno.sendKeys("1234567891234567");
WebElement ctype = driver.findElement(By.id("cc_type"));
Select Select6 =new Select(ctype);
Select6.selectByIndex(1);
WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
Select Select7 =new Select(expmonth);
Select7.selectByIndex(2);
WebElement expyr= driver.findElement(By.id("cc_exp_year"));
Select Select8 =new Select(expyr);
Select8.selectByIndex(12);
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("123");
WebElement bk = driver.findElement(By.id("book_now"));
bk.click();
Thread.sleep(5000);
WebElement orid = driver.findElement(By.id("order_no"));
String data = orid.getAttribute("value");

System.out.println(data);

















}	
	}
		


