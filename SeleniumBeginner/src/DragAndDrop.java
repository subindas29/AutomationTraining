import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions obj = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//li[@data-id='2']//a[contains(text(),'5000')])[1]"));
		WebElement destination = driver.findElement(By.xpath("//ol[@id='amt7']"));
		obj.dragAndDrop(source, destination).perform();
		
		WebElement source1 = driver.findElement(By.xpath("//li[@data-id='2']//a[contains(text(),'5000')])[1]"));
		WebElement destination1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		obj.dragAndDrop(source1, destination1).perform();

	}

}
