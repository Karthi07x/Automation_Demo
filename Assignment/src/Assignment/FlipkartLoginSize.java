package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		Rectangle rect = driver.findElement(By.xpath("//a[text()='Login']")).getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println("Height"+rect.getHeight());
		System.out.println("Width"+rect.getWidth());
	}

}
