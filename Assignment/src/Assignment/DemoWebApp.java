package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebApp {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Spider");
		driver.findElement(By.name("LastName")).sendKeys("Man");
		driver.findElement(By.name("Email")).sendKeys("spidermanA1@gmail.com");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Spider@123");
		driver.findElement(By.name("Password")).sendKeys("Spider@123");
	}

}
