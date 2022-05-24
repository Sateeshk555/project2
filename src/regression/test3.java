package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test3 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static  WebDriver driver;
	@BeforeSuite(groups="regression")
	public void connectDb() {
		Reporter.log("----connect to db----",true);
	}
	@BeforeMethod(groups="regression")
	public void openApp() {
		driver=new ChromeDriver();	
		driver.get("https://demoapp.skillrary.com/login.php?type=login");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("open the app",true);
	}
	@Test(groups="regression")
	public void testCase() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		Reporter.log("testing the loginpage",true);
	}
	@AfterMethod(groups="regression")
	public void closeApp() {
		driver.close();
		Reporter.log("close the app",true);
	}
	@AfterSuite(groups="regression")
	public void disconnectDb() {
		Reporter.log("----discconnect to db----",true);
	}
	

}
