import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Frames_Lightbox_Actionclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Learning_java_selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	/*	driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElements(By.tagName("a")).size()); //It will return size of anchor tag
		
		//We dont know how many frames are available on web page so that we use tagname of frame to find out frame in web page
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());  // o/p 3
		*/
		
		//driver.get("http://localhost/opencart/upload/");
		//driver.get("https://demo.opencart.com/");
		driver.get("https://omayo.blogspot.com/");  
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		//WebElement Desktops = driver.findElement(By.xpath("//*[text()='Desktops']"));
		//WebElement Desktops = driver.findElement(By.linkText("Desktops"));
		
		WebElement Blogs = driver.findElement(By.xpath("//*[text()='Blogs']"));
		
		a.moveToElement(Blogs).perform();
		
		WebElement selenium143 = driver.findElement(By.xpath("//*[text()='Selenium143']"));
		
		/*a.moveToElement(selenium143).perform();
		
		a.click(selenium143).perform(); */
		
		//optimizing above two into single line
		a.moveToElement(selenium143).click(selenium143).build().perform(); //we are using build here because we are performing 2 action(moveToElement,click) in one single line
		//If you want to perform two action in one single line better to use build
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
	}

}
