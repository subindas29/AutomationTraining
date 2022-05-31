import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement textbox1 = driver.findElement(By.id("single-input-field"));
		textbox1.sendKeys("Hello");
		textbox1.sendKeys(Keys.CONTROL + "a");
		textbox1.sendKeys(Keys.BACK_SPACE);
		
		/*WebElement rightclick = driver.findElement(By.id("button-one"));
		Actions obj = new Actions(driver);
		
		obj.contextClick(rightclick).perform();  
		
		
		WebElement doublec = driver.findElement(By.id("button-two"));
		
		obj.doubleClick(doublec).perform();  
		obj.moveToElement(doublec).perform(); */
		
		
		
		
		
		
		
		/* obj.sendKeys(Keys.ARROW_DOWN).perform(); // Keys -- static class, Arrow down is the the method
		obj.moveToElement(Singlec).perform();  // mouseover to any object in the page, method overloading */

	}

}
