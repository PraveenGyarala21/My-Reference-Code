package switching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {
	
	static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://way2automation.com/way2auto_jquery/dropdown.php");
		
		driver.findElement(By.xpath("//*[text()='Signin']")).click();
		
		WebElement userName = driver.findElement(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']//input[@name='username']"));
		
		userName.sendKeys("pravss");
		
		WebElement password = driver.findElement(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']//input[@name='password']"));
		
		password.sendKeys("Pepejeans@21");
		
		WebElement submit = driver.findElement(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']//input[@value='Submit']"));
		
		submit.click();
		
		//Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
	
	
	}

}
