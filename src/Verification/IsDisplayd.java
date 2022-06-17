package Verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayd {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement username = driver.findElement(By.id("username"));
			if(username.isDisplayed()) {
				System.out.println("test case is pass");
				username.sendKeys("abcdrfgh");
			}
			WebElement password = driver.findElement(By.name("pwd"));
			if(password.isDisplayed()) {
				System.out.println("test case is pass");
				username.sendKeys("abcdrfgh");
			WebElement LogiBut = driver.findElement(By.xpath("//div[text()='Login ']"));
			if(LogiBut.isEnabled()) {
				System.out.println("enable is pass");
				LogiBut.click();
			}
			Thread.sleep(3000);
			driver.navigate().refresh();
			WebElement chbx = driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
			if(chbx.isSelected()) {
				System.out.println("is selected");
				
			}
			else {
				System.out.println("its not selected");
			}
			
			
}
}
}