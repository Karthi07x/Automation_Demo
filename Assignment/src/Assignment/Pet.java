package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/");
		boolean sign = driver.findElement(By.xpath("//a[text()='Sign up']")).isDisplayed();
		if (sign==true) {
			System.out.println("Signup Button is displayed");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Sign up']")).click();
			driver.findElement(By.id("user")).sendKeys("asdfg@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("asdfgfhgjhretryty");
			driver.findElement(By.id("cpass")).sendKeys("asdfgfhgjhretryty");
			driver.findElement(By.id("firstName")).sendKeys("Spider");
			driver.findElement(By.id("lastName")).sendKeys("Man");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			WebElement status = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			if(status.isEnabled()) {
				System.out.println("Signup Button is Enable");
			}
			else {
				System.out.println("Signup Button is notEnable");
			}
			
		} else {
			System.out.println("Signup Button is not displayed");
			driver.quit();
		}
		driver.quit();
		
	}

}
