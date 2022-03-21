import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
// import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
// import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSALoginTest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities(); // Create Class and Object
//		caps.setBrowserName("firefox");
//		caps.setPlatform(Platform.WIN10);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444"), caps);
		driver.get("https://www.rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("[class='theme-btn register-btn']")).click();
		driver.close();
	}
}
