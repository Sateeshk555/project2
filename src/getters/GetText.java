package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String txt1 = ele.getText();
	    System.out.println(txt1);
	  
	    if(txt1.equals("Facebook helps you connect and share with the people in your life.")){
	    	
	    	System.out.println("verified====text is correct");
	    }
	    else {
	    	System.out.println("verification fail====text is not correct===please correct it ,rais the bug to deveops...");
	    }
	    driver.close();

	}

}
