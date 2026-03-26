package Assignment;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);
		List<WebElement> prints = driver.findElements(By.xpath("//div[text()='MOTOROLA g06 power (Pantone Tendril, 64 GB)']"));
		for (WebElement E : prints) {
			System.out.println(E.getText());
		}
		driver.findElement(By.xpath("//div[text()='Bank Offer']")).click();
		Thread.sleep(2000);
		Set<String> handle = driver.getWindowHandles();
		for (String s : handle) {
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//div[text()='Buy now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("1")).sendKeys("9500839540");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		}
		
	}


