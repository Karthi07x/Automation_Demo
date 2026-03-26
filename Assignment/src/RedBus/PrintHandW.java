package RedBus;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHandW {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.height);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
