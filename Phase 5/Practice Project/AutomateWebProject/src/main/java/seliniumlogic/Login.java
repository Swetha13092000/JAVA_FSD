package seliniumlogic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	 public static void main(String[] args)
	    {
		 System.setProperty("webdriver.chrome.driver","E:\\new\\95\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0MzY3NDQ2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("swetha@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("swe123");
	        
	        driver.findElement(By.id("loginbutton"))
         .click();
	        
	    }
}
