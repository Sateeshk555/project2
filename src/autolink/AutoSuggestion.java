package autolink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> liele = driver.findElements(By.xpath("//li[@class='sbct']"));
		int li = liele.size();
		System.out.println("total list of autosuggestion are === "  +li);
		
		for(WebElement alli:liele) {
			Thread.sleep(3000);
			System.out.println(alli.getText());
			
		}
		
		//driver.close();
		

	}

}
