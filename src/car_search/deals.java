package car_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deals {
	WebDriver driver;
	@BeforeTest
	public void setep() {
	  System.setProperty("web.chrome.chromedriver", "f://chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.clearcarrental.com/");
	}
	@AfterTest
	public void exit()  {
		//driver.close();
	}
	@AfterMethod
	public void back() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
	}
	@Test (priority = 1)
	public void oneway_deals() {
		driver.findElement(By.id("searchOpt7")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("destinationCity4")).sendKeys("Bhopal");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
}
