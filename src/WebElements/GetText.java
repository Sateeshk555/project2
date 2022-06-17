package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
  	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.xpath("//a[text()='Create a Page']"));
    String text = ele.getText();
    System.out.println("the comment is=== "+text);
    if(text.equals("Create a Page")) {
    	System.out.println("the text displayed is matching");
    }
    else {
    	System.out.println("the text is not maching ,raise the bugg to developer");
    }
    driver.close();
	}

}
