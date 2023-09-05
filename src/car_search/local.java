package car_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class local {
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
	public void half_day() {
		driver.findElement(By.id("searchOpt2")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
	@Test (priority = 2)
	public void full_day() {
		driver.findElement(By.id("searchOpt2")).click();
		driver.findElement(By.id("tripOpt1")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
	
}
