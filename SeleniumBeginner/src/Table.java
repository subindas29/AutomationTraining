import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");

	//WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[3]"));
	
	List<WebElement> list=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
System.out.println(list);

//printing table index values
/*for(){
	list.get(0).getText();
	}*/

}

}
