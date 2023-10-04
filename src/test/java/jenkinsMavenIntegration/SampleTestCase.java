package jenkinsMavenIntegration;



import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class SampleTestCase {
	
	
	@Parameters("browser")
	public void lauchBrowser(String Launching_browser)
	{
		WebDriver driver=null;
		System.out.println("Launch browser is : " + Launching_browser);
		
		if(Launching_browser.contains("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver","C:\Users\kishankumar\Downloads\chromedriver_win32\chromedriver.exe");

		driver = new ChromeDriver();
		}
		
		else if(Launching_browser.contains("Chrome"))
		{System.setProperty("webdriver.chrome.driver","C:\Users\kishankumar\Downloads\chromedriver_win32\chromedriver.exe");

		driver = new ChromeDriver();
			
		}
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		AssertJUnit.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
