package lesson1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEIssue {

	public static void main(String[] args)
	{
		WebDriver driver;
		String URL = "https://learn.letskodeit.com/p/practice";
		
		/*DesiredCapabilities DesCaps = DesiredCapabilities.internetExplorer();
		DesCaps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		DesCaps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		DesCaps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		DesCaps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		DesCaps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		DesCaps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipak\\old\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		driver.findElement(By.id("name")).sendKeys("Jai Swaminarayan");
		//driver.quit();
	}
}
