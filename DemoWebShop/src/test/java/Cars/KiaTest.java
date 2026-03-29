package Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiaTest {
	@Test
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kia.com/in/our-vehicles/seltos/showroom.html?utm_source=google&utm_medium=cpc&utm_campaign=search_brand_dec25&utm_content=text&utm_term=brand&gad_source=1&gad_campaignid=15639542040&gbraid=0AAAAADJaFdva5hXapnpgWrkxC1YSh8_5V&gclid=Cj0KCQjw7IjOBhDyARIsAFzrWQxkSsE12t0ztS_COh0Uc3Ct9owvuntixRk8IqoItnRSsjBNXiToP_gaAvEMEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Kia Is Launched",true);
	}

}
