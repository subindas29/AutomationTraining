import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement click1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		click1.click();
		//to click the OK on the alert button switchto method used
		driver.switchTo().alert().accept();
		
		WebElement click2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		click2.click();
		//to click the OK on the alert button switchto method used
		driver.switchTo().alert().dismiss();
		
		WebElement click3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		click3.click();
		//to click the OK on the alert button switchto method used
		String S = driver.switchTo().alert().getText();
		System.out.println(S);
		
		driver.switchTo().alert().sendKeys("Hello World");
		driver.switchTo().alert().accept();
		
	}

}
