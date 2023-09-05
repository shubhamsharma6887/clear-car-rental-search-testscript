package car_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class outsation {
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
	public void oneway_search() {
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("destinationCity4")).sendKeys("Delhi");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[onclick=\"searchSubmit();\"]")).click();
	}
	@Test (priority = 2)
	public void roundtrip_search() {
		driver.findElement(By.id("tripOpt1")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("destinationCity4")).sendKeys("Delhi");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("12-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[onclick=\"searchSubmit();\"]")).click();
	}
	@Test (priority = 3)
	public void multicity_search() {
		driver.findElement(By.id("tripOpt3")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("destinationCity4")).sendKeys("Delhi");
		driver.findElement(By.cssSelector("button[class=\"AddRemoveBtn\"]")).click();
		driver.findElement(By.id("destinationCity5")).sendKeys("Chandigarh");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("15-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
}
