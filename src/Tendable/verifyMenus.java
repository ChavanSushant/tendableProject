package Tendable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyMenus {

	public static void main(String[] args) {
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 1: Go to the tendable website
        driver.get("https://www.tendable.com");
        
 
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String requestADemo ="Request A Demo";
        
        // Verify accessibility of top-level menus
//        verifyTopLevelMenu(driver, "Home",requestADemo);
        verifyTopLevelMenu(driver, "Our Story",requestADemo);
        verifyTopLevelMenu(driver, "Our Solution",requestADemo);
        verifyTopLevelMenu(driver, "Why Tendable?",requestADemo);

        driver.quit();
        
        

	}
	
	public static void verifyTopLevelMenu(WebDriver driver,String menuName,String validate) {
		
		WebElement menuLink=driver.findElement(By.linkText(menuName));
		menuLink.click();
		
	    // Verify "Request a Demo" button presence
        WebElement demoButton = driver.findElement(By.xpath("//a[contains(text(), '"+validate+"')]"));
        
        if (demoButton.isDisplayed() && demoButton.isEnabled()) {
            System.out.println(menuName + ": "+validate+" button is present and active.");
        } else {
            System.out.println(menuName + ": "+validate+" button is missing or inactive.");
        }
	}
	

}
