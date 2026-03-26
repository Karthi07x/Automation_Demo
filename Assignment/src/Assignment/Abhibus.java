package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.linkText("View Buses")).click();
		Thread.sleep(2000);
		List<WebElement> busname = driver.findElements(By.xpath("//h5[contains(@class,'title')]"));
		System.out.println("Bus Name");
		System.out.println("");
		for (WebElement E : busname) {
			System.out.println(E.getText());
			
		}
		System.out.println("-----------------------------------------------------");
		List<WebElement> Time = driver.findElements(By.xpath("//span[contains(@class,'departure-time text-neutral-500')]"));
		System.out.println("departure Timing");
		System.out.println("");
		for (WebElement T : Time) {
			System.out.println(T.getText());
			
		}
		System.out.println("---------------------------");
		List<WebElement> arrive = driver.findElements(By.xpath("//span[contains(@class,'arrival-time text-neutral-500')]"));
		System.out.println("Arrive");
		System.out.println("");
		for (WebElement m : arrive) {
			System.out.println(m.getText());
			
		}
		List<WebElement> print = driver.findElements(By.xpath("//span[contains(@class,'fare text-neutral-800')]"));
		System.out.println("");
		System.out.println("Price Of Bus");
		System.out.println("");
		for (WebElement W : print) {
			System.out.println(W.getText());
			
		}
			
		}

	}




//h5[contains(@class,'title')]/../..//span[contains(@class,'departure-time text-neutral-500')]/../../../../../../../../..//span[contains(@class,'fare text-neutral-800')]
