import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitProgram  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
	
		//implicit wait syntax
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userName=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userName.sendKeys("carol");
		WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("1q2w3e4r");
		WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login-button']"));
		loginBtn.click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Clients']")));
		
		wait.until(ExpectedConditions.attributeContains(loginBtn, "class", "test"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(loginBtn, "Login"));
		
		WebElement clienttab=driver.findElement(By.xpath("//a[text()='Clients']"));
		clienttab.click();
		
		//Fluent Wait
//		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//		        .withTimeout(Duration.ofSeconds(30))
//		        .pollingEvery(Duration.ofSeconds(10))
//		        .ignoring(NoSuchElementException.class);

	}

}
