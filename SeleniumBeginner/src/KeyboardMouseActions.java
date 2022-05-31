import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement doublec = driver.findElement(By.id("doubleClickBtn"));
		Actions obj = new Actions(driver);
		obj.doubleClick(doublec).perform();  // ---- method overloading, also this doubleCLick will target the exact button
		
		WebElement Singlec = driver.findElement(By.id("rightClickBtn"));
		//obj.contextClick(Singlec).perform();  // -- no need to create object again, method overloading, same method name with diff parameters
		obj.contextClick().perform();   // it will click randomly somewhere in the page
		
		obj.sendKeys(Keys.ARROW_DOWN).perform(); // Keys -- static class, Arrow down is the the method
		obj.moveToElement(Singlec).perform();  // mouseover to any object in the page, method overloading
	}

}
