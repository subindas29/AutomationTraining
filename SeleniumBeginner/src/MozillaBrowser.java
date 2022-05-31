import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.flipkart.com/"); //no history, page open after all the load
		
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().to("https://www.flipkart.com/"); //keeep the history, will redirect to the page and do the operations
		
		}
}
