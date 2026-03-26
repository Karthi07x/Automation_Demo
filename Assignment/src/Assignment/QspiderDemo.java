package Assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Link in New Tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(2000);
		
		Set<String> handle = driver.getWindowHandles();
		for(String w : handle) {
			driver.switchTo().window(w);
	}
			List<WebElement> links = driver.findElements(By.tagName("h2"));
			for (WebElement w : links) {
				System.out.println(w.getText());


		}
		
		
	}
	}


