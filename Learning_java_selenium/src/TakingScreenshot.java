import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\repository\\Learning_java_selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Take screenshot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //This will take screenshot and type will file and stored it in srcfile
		//File destinationFile = new File("./Screenshots/omayo.png");   // omayo png is created and taken screenshot is stored under screenshots folder
		File screenshot = new File("./Screenshots");
		screenshot.mkdirs();//Scrennshot folder will be created and
		
		FileHandler.copy(srcFile,new File(screenshot,"omayo.png"));
		
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		File srcFile1 = multiSelectionBoxField.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File(screenshot,"multi.png"));
		
		
	}

}
