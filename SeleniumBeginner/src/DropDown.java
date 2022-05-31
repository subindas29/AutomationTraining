import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
				
		WebElement color = driver.findElement(By.id("single-input-field"));
		Select drop = new Select(color);
		//drop.selectByIndex(1);
		//drop.selectByValue("Yellow");
		drop.selectByVisibleText("Yellow");
		WebElement select = drop.getFirstSelectedOption(); // --> Why we have to declare webelement, it will return the WebElement
		String text = select.getText();
		System.out.println(text);
	}

}
