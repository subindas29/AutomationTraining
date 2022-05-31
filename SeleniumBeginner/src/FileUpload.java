import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class FileUpload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement choosetxt = driver.findElement(By.id("uploadfile_0"));
		//To in
		Actions set = new Actions(driver);
		set.moveToElement(choosetxt).click().perform();
		//choosetxt.click();
		
		//copy to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Subin.Das\\Documents\\cricket\\1647875806134.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste to window
		Robot obj = new Robot();
		//obj.keyPress(KeyEvent.VK_4);
		//obj.keyRelease(KeyEvent.VK_4);
		obj.delay(250);
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.keyRelease(KeyEvent.VK_V);
		obj.keyPress(KeyEvent.VK_ENTER);
		obj.delay(250);
		obj.keyRelease(KeyEvent.VK_ENTER);
		obj.delay(250);
		
		


	}

}
