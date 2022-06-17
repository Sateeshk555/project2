package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		Dimension size1 = ele1.getSize();
		int UserHei = size1.getHeight();
		int UserWid = size1.getWidth();
		System.out.println("username text box height is==== " +UserHei);
		System.out.println("username text box width is ===" +UserWid);
		WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));		
		Dimension size2 = ele2.getSize();
		int PassHei = size2.getHeight();
		int Passwid = size2.getWidth();
		System.out.println("password text box height is ==="  +PassHei);
		System.out.println("password text box width is ==="  +Passwid);
		driver.close();

		

	}

}
