package selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics01_Browser_Launching {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com");
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://rahulshettyacademy.com");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://rahulshettyacademy.com");
	}
}
