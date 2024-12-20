package assingment;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileWriter 
{
	public WebDriver driver;
	@Test 
	public void popups() throws AWTException, IOException
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		driver.manage().window().maximize();
		
		
		//Actions act=new Actions(driver);
		//WebElement popups = driver.findElement(By.xpath("//section[@id='customButton']"));
		//act.moveToElement(popups).click().perform();
		
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/file.html");
		WebElement pop = driver.findElement(By.id("a1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", pop);
		//popups.sendKeys("C:\\path\\to\\your\\file.txt");
	
		
		
		
		
		
		
		
		



	}

}
