package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusAssignment {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.redbus.in/")) {
			System.out.println("Home Page is Displayed");
			
		}
		else {
			System.out.println("Home page is not displayed");
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height :" +size.height);
		System.out.println("Width:" +size.width);
		
		driver.manage().window().setSize(new Dimension(600, 200));
		
	}

}
