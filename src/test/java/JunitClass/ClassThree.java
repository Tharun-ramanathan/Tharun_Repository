package JunitClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ClassThree {
	@Test
	public  void testClass()
	{
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.gmail.com");
		System.out.println("Page loaded Gmail");
		//System.out.println("Test3");		
	}
}
