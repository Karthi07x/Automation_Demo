package Assignment;

import java.net.URL;
import java.security.Identity;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppTwitter {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://demowebshop.tricentis.com/")) {
			System.out.println("HomePage is Displayed");
			
		}
		else {
			System.out.println("HomePage is not Displayed");
		}
		driver.findElement(By.linkText("Twitter")).click();
		String handle = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for (String s : window) {
			if (!s.equals(handle)) {
				driver.switchTo().window(s);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("name")).sendKeys("Qspider");
				driver.findElement(By.name("email")).sendKeys("qspider123@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
			}
			
		}
		driver.quit();
		
	}

}
