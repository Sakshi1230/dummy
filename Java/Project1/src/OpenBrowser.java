import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {


public static void main(String[] args)
{
	
	WebDriver driver;
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\subham kapoor\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
	driver =new FirefoxDriver();
	driver.get("https://www.google.co.in");
}
}
