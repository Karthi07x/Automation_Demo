package Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HyndaiTest {
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyundai.com/in/en?utm_source=Google-Search&utm_medium=CPL&utm_campaign=Always_On_2026_Hyundai_Brand&campaignid=19854021300&adgroupid=179631077199&matchtype=b&keyword=hyundai%20car%20dealership%20near%20me&device=c&extensionid=&gad_source=1&gad_campaignid=19854021300&gbraid=0AAAAADB1tifHs5ICk_CX73GIxwTqSzqI2&gclid=Cj0KCQjw7IjOBhDyARIsAFzrWQxCc-MuT7JWLoTsSz9gTFQIXKFN190VMYE4aYEP5TAM8W4593qHmBEaAkW4EALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Hyundai Is Launched",true);
	}

}
