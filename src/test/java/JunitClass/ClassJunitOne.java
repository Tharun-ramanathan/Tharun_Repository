package JunitClass;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ClassJunitOne 
{
@Ignore	
@BeforeClass

public static void beforeClass()
{
	System.out.println("1st Class");
	
}
@Test
public void haun()
{
	
}
@Test
public  void testClass()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement element1 = driver.findElement(By.xpath("//button[@value='1']"));
	element1.click();
	String currentUrl = driver.getCurrentUrl();
	currentUrl.contains("facebook");
	Assert.assertSame("Verified",currentUrl);
	
	System.out.println("Page Facebook Loaded");
	
}




	
	

}