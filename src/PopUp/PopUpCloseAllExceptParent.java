package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to close all window except parent window
public class PopUpCloseAllExceptParent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://nxtgenaiacademy.com/multiplewindows/");
    String pa = driver.getWindowHandle();
    driver.findElement(By.name("newbrowserwindow123")).click();
    driver.findElement(By.name("newbrowserwindow123")).click();
    driver.findElement(By.name("newbrowserwindow123")).click();
    Set<String> whAll = driver.getWindowHandles();
    for(String a:whAll) {
    	driver.switchTo().window(a);
    	if(a.equals(pa)) {
    		
    	}
    	else {
    		driver.close();
    	}
}
    }
}
