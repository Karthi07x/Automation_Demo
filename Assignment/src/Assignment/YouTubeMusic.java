package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeMusic {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		WebElement music = driver.findElement(By.xpath("//span[text()='YouTube Music']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", music);
		driver.findElement(By.xpath("//span[text()='YouTube Music']")).click();
		
		Set<String> window = driver.getWindowHandles();
		for (String string : window) {
			driver.switchTo().window(string);
		}
		WebElement id = driver.findElement(By.xpath("//input[@aria-owns='suggestion-list']"));
		id.sendKeys("G.V.Prakash Kumar",Keys.ENTER);
		List<WebElement> song = driver.findElements(By.xpath("//ytmusic-responsive-list-item-renderer[@class='style-scope ytmusic-shelf-renderer']"));
		System.out.println("Total no of Songs:"+song.size());
		for (WebElement webElement : song) {
			System.out.println(webElement.getText());
		}
		
		
		//driver.quit();


	}

}
