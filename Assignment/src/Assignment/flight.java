package Assignment;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://blazedemo.com/reserve.php"); //td[text()='$765.32']/..//preceding-sibling::input
	}

}
