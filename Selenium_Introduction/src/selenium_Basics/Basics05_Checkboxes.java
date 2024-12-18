package selenium_Basics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Basics05_Checkboxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Select Checkbox
		WebElement ele = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		Assert.assertFalse(ele.isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		WebElement ele1 = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		Assert.assertTrue(ele1.isSelected());
		
		// Print number of checkboxes
		List<WebElement> size = driver.findElements(By.xpath("//div[@id='discount-checkbox']/div"));
		System.out.println(size.size());
	}
}