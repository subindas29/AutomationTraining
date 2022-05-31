import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		
		WebElement checkbox1 = driver.findElement(By.id("gridCheck"));
		checkbox1.click();
		Boolean B = checkbox1.isSelected();
		System.out.println(B);
		

	}

}
