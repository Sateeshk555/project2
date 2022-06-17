package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//WAS to handle alert popup in demo.automationtesting site  and click for ok button in alert 
public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click with ok button
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		//click the button to diplay on alert box
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();	
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert aler = driver.switchTo().alert();
		aler.accept();
		//driver.close();

		
		
		
		

	}

}
