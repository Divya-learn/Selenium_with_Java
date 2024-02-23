import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowsmechanism {
	
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Learning_java_selenium\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://omayo.blogspot.com/");    //get is a non static method 
		
		driver.manage().window().maximize();
		
		//Implicit wait is applied for all elements
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); this is deprecated cannot be used now below is alternate
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));		
		
		driver.findElement(By.className("dropbtn")).click();
		
		//Explicit wait is applied for specific element
		
		//WebDriverWait wait = new WebDriverWait(driver, 7 ); cannot be used now use below
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(20));
		WebElement facebookelement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		facebookelement.click();
		
		driver.navigate().back();
		//Alert
		driver.findElement(By.id("alert1")).click();
		Alert a= driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		//driver.switchTo().defaultContent(); 
		
		//Handling Dropdown
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select element = new Select(dropdown);
		
		List<WebElement> printallelementsindropdown = element.getOptions();
		
		for(WebElement e : printallelementsindropdown)
		{
			System.out.println(e.getText());
		}
		//element.selectByVisibleText("doc 1");
		element.selectByIndex(3);
		
		//Multiselection fields
		
		WebElement multiselection = driver.findElement(By.id("multiselect1"));
		Select element1 = new Select(multiselection);
		
         List<WebElement> printallelementsinmultiselection = element1.getOptions();
		
		for(WebElement e : printallelementsinmultiselection)
		{
			System.out.println(e.getText());
		}
		element1.selectByVisibleText("Volvo");
		element1.selectByVisibleText("Swift");
		element1.selectByVisibleText("Audi");
		
		//deselect the element
		element1.deselectByVisibleText("Audi");
		//driver.quit();
		
		
		
		
		
		
		
	}

}
