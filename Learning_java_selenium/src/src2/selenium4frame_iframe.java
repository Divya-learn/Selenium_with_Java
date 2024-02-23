package src2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4frame_iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\repository\\Learning_java_selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/iframe");
		
	/*	BY id locator
		
		     //switching to frame and then perform action
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Hi");
		
	*/
		
	/*	driver.get(" https://docs.oracle.com/javase/8/docs/api/");
		//By name locator
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Description")).click();
*/
		
		
/*		//Parent,child,sibling frame
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switching to parent frame
		driver.switchTo().frame("frame-top");
		//switching to child frame
		driver.switchTo().frame("frame-left");
		//locating the element
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		
		//switching to parent frame
		driver.switchTo().parentFrame();
		//switching to child frame
		driver.switchTo().frame("frame-middle");
		//locating the element
		String text2 = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text2);
		
		
		//switching to parent frame
		driver.switchTo().parentFrame();
		//switching to child frame
		driver.switchTo().frame("frame-right");
		//locating the element
		String text3 = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text3);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		String bottomtext =driver.findElement(By.xpath("//body")).getText();
		System.out.println(bottomtext);
*/
		//need to check
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		
		int sizeofFrame =frame.size();
		int index=0;
		int s;
		
		for(int i=0; i<sizeofFrame;i++)
		{
			driver.switchTo().frame(i);
			s = driver.findElements(By.linkText("Description")).size();
			if(s>0)
			{
			index = i;
			driver.switchTo().defaultContent();
			break;
		}
			driver.switchTo().defaultContent();
		}
		
		driver.switchTo().frame(index);
		driver.findElement(By.linkText("Description")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
