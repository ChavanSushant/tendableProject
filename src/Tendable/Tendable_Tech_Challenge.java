package Tendable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tendable_Tech_Challenge {

	public static void main(String[] args) throws InterruptedException {
		
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 1: Go to the tendable website
        driver.get("https://www.tendable.com");
        
 
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
        Tendable_Tech_Challenge Al= new Tendable_Tech_Challenge();
//        String home=;
		String our_Story= "//a[text()='Our Story']";
		String our_Solution="//a[text()='Our Solution']";
		String why_Tendable="//a[text()='Why Tendable?']";
		
//        Al.accesibiltyOfElements(driver,home);
        Al.accesibiltyOfElements(driver,our_Story,"our_Story");
        Al.accesibiltyOfElements(driver,our_Solution,"our_Solution");
        Al.accesibiltyOfElements(driver,why_Tendable,"why_Tendable");
    
        driver.quit();
	}
	
	public void accesibiltyOfElements(WebDriver driver,String locator,String tabName) {
		
		boolean result=driver.findElement(By.xpath(locator)).isEnabled();
		 
		
		boolean result1=driver.findElement(By.xpath(locator)).isDisplayed();
		

		
		if(result== true && result1==true) {
			
			System.out.println(tabName+"Element is accessible within page.");
		}
		else {
			System.out.println(tabName+"Element is not accessible within page.");
		}
		
	}

}
