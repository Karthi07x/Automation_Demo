package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshersWorld {
public static void main(String[] args) throws IOException {
	FileInputStream file= new FileInputStream("./TestData1/Common.properties");
	Properties prop=new Properties();
	prop.load(file);
	String url = prop.getProperty("url");
	System.out.println(url);
	String name = prop.getProperty("username");
	String email = prop.getProperty("email");
	String mobile = prop.getProperty("mobile");
	String date = prop.getProperty("age");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("firstname")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	driver.findElement(By.name("dob")).sendKeys(date);
	WebElement dropdown = driver.findElement(By.id("course"));
	Select s= new Select(dropdown);
	s.selectByIndex(1);
	
	
	File pdf = new File("E:/Testing Notes/Java_Part_3.pdf");
	String path = pdf.getAbsolutePath();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
	
}
}
