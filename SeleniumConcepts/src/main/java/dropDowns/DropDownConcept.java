package dropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownConcept {
	
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
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement dropDownThumbnail = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='linkbox margin-bottom-20'][4]//ul//li[2]//a[@href='dropdown.php']"))));
		
		dropDownThumbnail.click();
		
		//Thread.sleep(5000);
		
		
		
		driver.switchTo().frame(0);
		
		
		
		// Selecting the dropDown values using the Select class
		
		WebElement dropDown = driver.findElement(By.xpath("//html[@xmlns='http://www.w3.org/1999/xhtml']/body/select"));
		
	//	dropDown.click();
		
		Select oselect = new Select(dropDown);
		
		oselect.selectByVisibleText("India");
		
		driver.switchTo().defaultContent();
		
		Actions action = new Actions(driver);
		
		WebElement FramesButton = driver.findElement(By.xpath("//a[text()='Frames and Windows']"));
		
		action.moveToElement(FramesButton).build().perform();
		
		driver.close();
		
		
		
		
		
		
	}

}
