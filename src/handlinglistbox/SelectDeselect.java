package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("file:///C:/Users/lohith/OneDrive/Desktop/html/MTR.html");
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   WebElement mtrlistbox = driver.findElement(By.id("mtr"));
   Select s=new Select(mtrlistbox);
   Thread.sleep(5000);
   s.selectByIndex(0);
   Thread.sleep(5000);
   s.selectByValue("d");
   Thread.sleep(5000);
   s.selectByVisibleText("vada");   
   if(s.isMultiple()==true) {
	   Thread.sleep(5000);
	   s.deselectByVisibleText("vada");
	   Thread.sleep(5000);
	   s.deselectByValue("d");
	   Thread.sleep(5000);
	   s.deselectByIndex(0);
	   Thread.sleep(5000);
   }
   driver.close();
}
}
