import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMDynamicWebTable {
	
	public static void main(String args[]) throws Exception {
		
		//*[text()='Satish J']//preceding-sibling::td//child::div//child::input
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div/input
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/input
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/div/input
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.xpath("//*[@href='https://ui.freecrm.com']")).click();
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("gyarala.praveen@gmail.com");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Welcome1!");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Contacts']")).click();
		
		Thread.sleep(5000);
		
		
		
		for(int i=1; i<=3; i++ ) {
		
		String name = driver.findElement(By.xpath("//table//tr["+ i +"]//td[2]")).getText();
		
		
		if(name.contains("Reddy")) {
			
			driver.findElement(By.xpath("//table//tr["+ i +"]//td[1]")).click();
		}
		else
		{
			System.out.println("Not matched");
		}
		
		}
		
		
	}

}
