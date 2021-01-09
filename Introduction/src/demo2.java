import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//selenium - code
		
//Create driver objectfor chrome browser
		
// We will stricly 
		
		
		/*class name = X
				
				X driver=new X();*/
		
		
// invoke .exe file first
// chrome driver path /Users/neilmccormick/Documents/chromedriver		
		
		System.setProperty("webdriver.chrome.driver","//Users//neilmccormick//Documents//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com"); //Bring up web page//
		System.out.println(driver.getTitle());// Print title page in console to confirm correct page//
		System.out.println(driver.getCurrentUrl());// Print Url in console to confirm URL is right not hacked//
		System.out.println(driver.getPageSource());// Print Page source in console//
		
		
		
		
	
		
	}

}
