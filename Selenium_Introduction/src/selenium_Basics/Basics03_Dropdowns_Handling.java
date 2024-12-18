package selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics03_Dropdowns_Handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Static dropdown
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
/*		Manual Process not recommended
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
*/
		int j=1;
		while (j<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			j++;
		}

/*		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
*/	
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Dynamic dropdown
		
		// Scenario-1 (By using Indexing concept)
/*
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='HYD']")).click();
		 driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
*/
		// Senarion-2 (Without using Indexing concept)
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
	}
}