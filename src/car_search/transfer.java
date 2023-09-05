package car_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class transfer {
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
	public void railway_station() {
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("pickUpLocation")).sendKeys("Junction Bg Railway Station (indb)");
		driver.findElement(By.id("dropLocation")).sendKeys("L I G Colony");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
	@Test (priority = 2)
	public void airport() {
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("tripOpt1")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("pickUpLocation")).sendKeys("Devi Ahilya Bai Holkar Airport (idr)");
		driver.findElement(By.id("dropLocation")).sendKeys("L I G Colony");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
	@Test (priority = 3)
	public void area_hotel() {
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("tripOpt3")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Indore");
		driver.findElement(By.id("pickUpLocation")).sendKeys("Hotel Samrat");
		driver.findElement(By.id("dropLocation")).sendKeys("Devi Ahilya Bai Holkar Airport (idr)");
		driver.findElement(By.id("datepicker")).sendKeys("10-09-2023");
		driver.findElement(By.id("datepicker2")).sendKeys("10-09-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("10 : 00 AM");
		driver.findElement(By.cssSelector("button[class=\"btn btn-secondary rounded-0 w-100 h-100\"]")).click();
	}
}
