import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import InterruptedException.javalang;
public class Locators {
	

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Learning_java_selenium\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		//A blank chrome browser is launched
		WebDriver driver = new ChromeDriver(options);
		
		//The provided URL will be opened in chrome
		driver.get("https://omayo.blogspot.com/");    //get is a non static method 
		
		//maximixe the browser
		driver.manage().window().maximize();
		
		//Finding the UI elements
		/* Finding elements by id
		        WebElement ele = driver.findElement(By.id(("confirm")));
		*/
		
		/*Finding elements by name
		  WebElement ele = driver.findElement(By.name(("q")));
		  ele.sendKeys("Divya");	
		  */
		
		
	/*	WebElement ele = driver.findElement(By.id("textbox1"));
		//Hold the program for 5s
		Thread.sleep(5000);
		ele.clear();
		*/
		
		
		/* // Passing the values
		 WebElement ele = driver.findElement(By.className("gsc-input"));
		
		ele.sendKeys("Divya");	
		*/
		
		//WebElement ele = driver.findElement(By.linkText(("Selenium143")));
		
		//WebElement ele = driver.findElement(By.partialLinkText(("Sele")));

		
		//click on confirm button
		//ele.click();
		
		/*clear the element in webpage
		 WebElement ele = driver.findElement(By.id("textbox1"));
		ele.clear();
		*/
		
		/*WebElement ele = driver.findElement(By.className("widget-content"));
		String gettingtext = ele.getText();   //getting the text is string so need to store in string datatype
		System.out.println(gettingtext);
		*/
		String text =driver.findElement(By.className("widget-content")).getText();
		System.out.println(text);
		
		/*
		String title=driver.getTitle();  gives title of the webpage i.e omaya QAFox 
		System.out.println(title);
		*/
		
	  /*WebElement ele =driver.findElement(By.linkText("Page One"));//goes to Page One URL
	    ele.click();   //clicking that
	    String URL = driver.getCurrentUrl();   //getting the opened page URL
		System.out.println(URL); //printing that opened page URL
		*/
		
	
	/*	WebElement ele =driver.findElement(By.linkText("SeleniumTutorial"));//goes to Page One URL
	    ele.click(); 
		//driver.close();  //it will close only the 1st open window
		 
		 */
		//driver.quit();//it will close all the open window
		
		/*WebElement ele = driver.findElement(By.id("textbox1"));
		String Attributename = ele.getAttribute("name");
		System.out.println(Attributename);

		String text = driver.findElement(By.id("alert1")).getAttribute("value"); //return type string store it in string
		System.out.println(text);
		
		boolean button = driver.findElement(By.id("timerButton")).isDisplayed();   //return type boolean store it in boolean
		System.out.println(button);
		
	//	isEnabled()
		*/
		
	
	/*	boolean selectedornot = driver.findElement(By.id("radio1")).isSelected();
		System.out.println(selectedornot);
	*/
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		
		
		
		
		
		
	}		
	

}
