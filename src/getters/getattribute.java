package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String att = ele.getAttribute("name");
		System.out.println("attribute value is ===="  +att);
		if(att.equals("pass")) {
			System.out.println("attribute is same as in html , test case pass");
		}
		else {
			System.out.println("attribute not matching ,rais the bug report to developer");
		}
		driver.close();
	}

}
