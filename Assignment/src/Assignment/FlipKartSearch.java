package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 Pro");
		Thread.sleep(2000);
		System.out.println("--------------------------------");
		System.out.println("Search Widget");
		System.out.println("--------------------------------");
		List<WebElement> search = driver.findElements(By.xpath("//a[@tracking='[object Object]']"));
		for (WebElement webElement : search) {
			System.out.println(webElement.getText());
		}
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("--------------------------------");
		System.out.println("iPhone Details");
		System.out.println("--------------------------------");
		List<WebElement> print = driver.findElements(By.xpath("//div[contains(@class,'RG5Slk')]"));
		for (WebElement pri : print) {
			System.out.println(pri.getText());
		}
		System.out.println("--------------------------------");
		System.out.println("Price");
		System.out.println("--------------------------------");
		List<WebElement> rate = driver.findElements(By.xpath("//div[contains(@class,'RG5Slk')]/../..//div[contains(@class,'hZ3P6w DeU9vF')]"));
		for (WebElement ra : rate) {
			System.out.println(ra.getText());
		}
		
		
	}

}
