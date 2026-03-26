package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	WebElement user = driver.findElement(By.id("username"));
	user.clear();
	user.sendKeys("Selenium");
	WebElement pass = driver.findElement(By.name("password"));
	pass.clear();
	pass.sendKeys("test@123",Keys.ENTER);
	Thread.sleep(4000);
	WebElement print = driver.findElement(By.id("validationMessage"));
	System.out.println(print.getText());
}
}
