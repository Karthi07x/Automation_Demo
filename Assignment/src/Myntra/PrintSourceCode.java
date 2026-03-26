package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSourceCode {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	
	String SourceCode = driver.getPageSource();
	System.out.println(SourceCode);
	
}
}
