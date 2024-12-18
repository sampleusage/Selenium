package selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics06_Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		// Alert accept()
		String name = "Ram";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Alert dismiss()
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
}