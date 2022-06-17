package autolink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
//WAS to printall the links present in facebook
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 List<WebElement> AllLink = driver.findElements(By.xpath("//a"));
		 int count = AllLink.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++) {
			 WebElement link = AllLink.get(i);
			 String text = link.getText();
			 System.err.println(text);
		 }
		driver.close();
		 
		
		
		

	}

}
