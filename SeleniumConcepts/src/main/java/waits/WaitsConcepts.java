package waits;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitsConcepts {
	
	static WebDriver driver;
	
	public static void main(String args[]) {
		
		// Implicit wait concept
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		// Explicit Wait Concept
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement element = driver.findElement(By.xpath(""));
		
		element = wait.until(ExpectedConditions.visibilityOf(element));
		
		boolean value = element.isDisplayed();
		
		System.out.println(value);
		
		
		
		
		
		
		// FluentWait Concept
		
		final WebElement element1 = driver.findElement(By.xpath("//a[@id='target']"));
		
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		
		wait.withTimeout(30, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		
		
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				
				
				boolean bValue = element1.isDisplayed();
				
				if(bValue==true) {
					
					System.out.println("Element available");
								}
				
				
				for(int j=1; j<10; j++) {
				
				List<WebElement> MoreElements = driver.findElements(By.xpath("//a[@id='target']"));
				
				int size = MoreElements.size();
				
				for(int i=size; i<=size; i++  ) {
					
				System.out.println(MoreElements.get(size-1).getText());
					
												}
				
				try {
					
					Thread.sleep(9000);
					
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
													 }
				
										}
				
				return bValue;
				
				
				
				
													  }
			
																						};
		
		
		wait.until(function);
		
		
		
		
	}

}
