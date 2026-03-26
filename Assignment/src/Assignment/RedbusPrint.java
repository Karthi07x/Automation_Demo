package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusPrint {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("srcinput")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("destinput")).sendKeys("Hyderabad");
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//button[contains(@class,'primaryButton___5380e6 searchButtonWrapper___2d58a0')]")).click();
		driver.findElement(By.cssSelector("button[aria-label='Search buses']")).click();
		
		
	}

}
