package selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics02_Locators {
/*
		1. Id
		2. Xpath
		3. CSS Selector
		4. Name
		5. Class Name
		6. Tag Name
		7. Link Text
		8. Partial Link Text
*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector(".forgot-pwd-container")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Ram");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
	}
}