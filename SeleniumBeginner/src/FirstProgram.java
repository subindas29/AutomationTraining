import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		driver.manage().window().maximize();
		String text = driver.getCurrentUrl();
		System.out.println(text);
		String text1 = driver.getTitle();
		System.out.println("Title : "+text1);
		String text3 = driver.getPageSource();
		System.out.println(text3);
		driver.quit();
		
		
		/*Webdriver is an interface, driver is an refernce variable, 
		new Chromedriver is the object here, CHromedriver is the class -- 
		this is runtime polymorphism....type casting , get is the method inside the weDriver interface*/
		
		
		/*EdgeDriver
		System.setProperty("webdriver.edge.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver(); */
		
	}

}
