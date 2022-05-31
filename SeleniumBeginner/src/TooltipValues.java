import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipValues {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement Allb = driver.findElement(By.id("searchDropdownBox"));
		String tip = Allb.getAttribute("title"); // --- to get the tooltip value , tooltip value will be always in the "title" attribute
		System.out.println(tip+ "is the tooltip value");
		
		
	}

}
