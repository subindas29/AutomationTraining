import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("frame1");
		/*WebElement sample2 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(sample2);*/
		
		driver.switchTo().frame(1);  //its is 1 here, because in the iframe tag its coming in 2nd tag
		
		WebElement sample1 = driver.findElement(By.id("sampleHeading"));
		String S = sample1.getText();
		System.out.println(S);
		
		driver.switchTo().defaultContent();  // or driver.switchTo().parentFrame(); -- both same function, to go out of the frame
		
		
		
	}

}
