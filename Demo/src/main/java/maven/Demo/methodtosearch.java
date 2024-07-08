package maven.Demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class methodtosearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("vivo");
	
	List<WebElement>alloptions = driver.findElements(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	String optionString = "vivo t3x 5+g";
	
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='vivo t3x 5+g'", search);
	   
		
		
	}
	      
		
	


}
