import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		WebElement parentT = driver.findElement(By.id("tabButton"));
		parentT.click();
		
		//parentwindow id generation
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//to store multiple window ids 
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		//to iterate through each index
		Iterator<String> iterator = allwindows.iterator();
		while(iterator.hasNext()) //checking index value. if present returns true or else false
		{
			//get child window id
			String childWindow = iterator.next();
			if(!parentWindow .equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement childelement1 = driver.findElement(By.id("sampleHeading"));
				String S = childelement1.getText();
				System.out.println(S);
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
