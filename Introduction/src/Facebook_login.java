import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//neilmccormick//Documents//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.procreditcontrol.co.uk/");
		driver.findElement(By.name(= "About").click());
	
	

	}

}
