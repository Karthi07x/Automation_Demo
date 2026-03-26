package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDFClogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://homeloans.hdfc.bank.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions actions = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//a[text()='Login']"));
        actions.clickAndHold(move).perform();
        driver.findElement(By.xpath("(//a[text()='Login To NetBanking'])[1]")).click();
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String w : windows)
        {
            if(!w.equals(parent))
            {
                driver.switchTo().window(w);
            }
        }

        driver.findElement(By.xpath("(//button[text()='Login'])[1]")).click();
        driver.findElement(By.xpath("(//span[text()='NetBanking'])[1]")).click();
        Set<String> all = driver.getWindowHandles();

        for(String w : all)
        {
            driver.switchTo().window(w);
        }
        //driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
        driver.findElement(By.partialLinkText("Know More...")).click();
    }
}