package RedBus;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeHandW {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().setSize(new Dimension(200, 600));
}
}
