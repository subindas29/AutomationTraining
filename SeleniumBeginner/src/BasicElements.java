import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Element Declaration - to identify the fields - 8 techniques to declare
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement message = driver.findElement(By.id("single-input-field"));
		message.sendKeys("Welcome to the automation world");
		
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		
		WebElement valueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		valueA.sendKeys("10");
		
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("15");
		
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
		
	}

}
