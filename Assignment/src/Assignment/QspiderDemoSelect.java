package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QspiderDemoSelect {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement code = driver.findElement(By.id("country_code"));
		Select se = new Select(code);
		se.selectByVisibleText("+91");
		driver.findElement(By.id("phone")).sendKeys("9500839540");
		driver.findElement(By.id("male")).click();
		WebElement sele3 = driver.findElement(By.id("select3"));
		Select sel2=new Select(sele3);
		sel2.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("select5"));
		Select sel3=new Select(state);
		sel3.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select sel4 = new Select(city);
		sel4.selectByVisibleText("Madurai");
		Thread.sleep(2000);
		//String time = LocalDateTime.now().toString().replace(":", "-");
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File temp = ts.getScreenshotAs(OutputType.FILE);
		//File dest= new File("./screenshot/"+time+".png");
		//FileHandler.copy(temp, dest);
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement drop = driver.findElement(By.id("select-multiple-native"));
		Select sel6 = new Select(drop);
		sel6.selectByIndex(1);
		sel6.selectByIndex(2);
		sel6.selectByIndex(4);
		sel6.selectByIndex(5);
		
		
		//WebElement button = driver.findElement(By.xpath("//button[text()='Add']"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(button));
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Add']")).click();
		 
			String time2 = LocalDateTime.now().toString().replace(":", "-");
			TakesScreenshot ts1=(TakesScreenshot)driver;
			File temp1 = ts1.getScreenshotAs(OutputType.FILE);
			File dest1= new File("./screenshot/"+time2+".png");
			FileHandler.copy(temp1, dest1);
		driver.quit();
	}


}
