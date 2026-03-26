package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebLogin {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("asdfqwer@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("asdxfg");
		driver.findElement(By.className("button-1 login-button")).click();
		driver.quit();
	}

}
