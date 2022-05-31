import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
		String size = showMessage.getCssValue("font-size");
		System.out.println(size);
		
		String colour = showMessage.getCssValue("background-color");
		System.out.println(colour);
		
		String attribute1 = showMessage.getAttribute("class");
		System.out.println(attribute1);
		
		String tagName = showMessage.getTagName();
		System.out.println(tagName);

	}

}
