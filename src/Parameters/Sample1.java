package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Sample1 { 
	WebDriver driver;
	
	@Parameters({"browser","url"})
	
	@Test
	public void test(String browser,String url)
	{
		if(browser.equalsIgnoreCase("gecko"))
		{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(url);
	}
}
