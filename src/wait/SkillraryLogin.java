package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url1 = driver.getCurrentUrl();
		System.out.println("currenturl url of login page ===== test case pase" +url1);
		//Thread.sleep(4000);	    
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		//Thread.sleep(4000);
		String url3 = driver.getCurrentUrl();
		System.out.println("current url of home page is ====" +url3);
		driver.findElement(By.partialLinkText("Users")).click();
		//Thread.sleep(4000);
		String url2 = driver.getCurrentUrl();
		String tit = driver.getTitle();
		System.out.println("the url of user page is" +url2 +tit);
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		String url4 = driver.getCurrentUrl();
		System.out.println("current url of sales page"  +url4);
		//Thread.sleep(4000);
		driver.close();
		
		
		
		
		

}
}
