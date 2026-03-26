package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspaTable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.espncricinfo.com/series/icc-world-test-championship-2025-2027-1472510/points-table-standings");
	WebElement tn = driver.findElement(By.xpath("//span[text()='India']"));
	System.out.println(tn.getText());
	WebElement team = driver.findElement(By.xpath("//span[text()='India']/../../../..//following-sibling::td[2]"));
	System.out.println(team.getText());
	
}
}
