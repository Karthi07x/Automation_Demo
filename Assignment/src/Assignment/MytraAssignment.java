package Assignment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MytraAssignment {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.myntra.com/")) {
			System.out.println("Homepage is displayed");
			
		}
		else {
			System.out.println("HomePage is not displayed");
		
		}
		String source = driver.getPageSource();
		System.out.println(source);
		driver.quit();
		}
}
