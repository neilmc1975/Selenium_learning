import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//neilmccormick//Documents//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		//How to login to salesforce using elements from the web page using chrome developer tools//
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Neil McCormick");
		driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		
		
				
				
			
		
		
	
	

	}

}
