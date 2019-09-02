package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdXpathDemo {

	@Test
	public void sampleTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipak\\old\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		String URL = "https://www.google.com";
		driver.get(URL);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Mahantswami Vichran");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("BAPS");
		
		
	}
	
}
