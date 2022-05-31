
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Male1 = driver.findElement(By.id("inlineRadio1"));
		Male1.click();
		Boolean B = Male1.isSelected();
		System.out.println(B+", Male is selected");
		
		
		/*WebElement Female1 = driver.findElement(By.id("inlineRadio2"));
		Female1.click();
		Boolean C = Female1.isSelected();
		System.out.println(C+", Female is selected"); */
		
		
		
	}

}
