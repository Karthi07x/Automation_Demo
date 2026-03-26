package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHomePage {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String url = driver.getCurrentUrl();
		
		if (url.equals("https://www.myntra.com/")) {
			System.out.println("Homepage is displayed");
			
		}
		else {
			System.out.println("HomePage is not displayed");
		}
	}

}
