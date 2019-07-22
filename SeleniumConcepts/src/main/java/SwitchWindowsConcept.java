import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowsConcept {
	
	static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		
		
		driver.get("http://demo.guru99.com/popup.php");
		
		String mainWindow = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		
		WebElement link  = driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
		
		link.click();
		
		Set<String> windows = driver.getWindowHandles();
		 
		 for(String win:windows) {
			 
			 System.out.println(win);
			 
			 if(!mainWindow.equalsIgnoreCase(win)) {
				 
				 driver.switchTo().window(win);
			 }
		 }
		
		 WebElement vel = driver.findElement(By.xpath("//*[@name='emailid']"));
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 wait.until(ExpectedConditions.visibilityOf(vel));
		 
		 vel.sendKeys("Praveen");
		 
		 
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(mainWindow);
		
		driver.close();
		
	}

}
