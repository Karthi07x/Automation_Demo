package RedBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyHomePage {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if(url.equals("https://www.redbus.in/"))
		System.out.println("Home page is Dispayed");
	else
		System.out.println("Home Page is not Displayed");
}
}
