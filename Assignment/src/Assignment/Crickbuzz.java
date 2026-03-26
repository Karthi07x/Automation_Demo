package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Crickbuzz {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement photo = driver.findElement(By.xpath("//button[@title=\"More Photos\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", photo);
		photo.click();
		List<WebElement> count = driver.findElements(By.xpath("//img[@loading='lazy']"));
		System.out.println("Number of Photos"+count.size());
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Set<String> window = driver.getWindowHandles();
		for (String string : window) {
			if(!string.equals(parent)) {
			driver.switchTo().window(string);
			
				break;
		}}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asdsfd");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("asdsfdfd");
		String time = LocalDateTime.now().toString().replace(":", "-");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(2000);
		driver.quit();
		



	}

}
