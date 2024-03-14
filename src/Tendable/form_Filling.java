package Tendable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class form_Filling {

	public static void main(String[] args) {
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 1: Go to the tendable website
        driver.get("https://www.tendable.com");
        
 
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
     // 3. Navigate to the "Contact Us" section, choose "Marketing", and complete the form
        WebElement contactUs=driver.findElement(By.linkText("Contact Us"));
        contactUs.click();
        
        String marketingContactUs ="//div[contains(text(),'Marketing')]/..//button[text()='Contact']";
        driver.findElement(By.xpath(marketingContactUs)).click();
        
        String fullName ="(//input[@id=\"form-input-fullName\" ])[1]";
        driver.findElement(By.xpath(fullName)).sendKeys("SUSHANT CHAVAN");
        
        String organisationName ="(//input[@id=\"form-input-organisationName\" ])[1]";
        driver.findElement(By.xpath(organisationName)).sendKeys("CLARIVATE");
        
        String cellPhone ="(//input[@id=\"form-input-cellPhone\" ])[1]";
        driver.findElement(By.xpath(cellPhone)).sendKeys("9767976463");
        
        String email ="(//input[@id=\"form-input-email\" ])[1]";
        driver.findElement(By.xpath(email)).sendKeys("sushantcm01@gmail.com");
        
        String i_Agree ="(//input[@id=\"form-input-consentAgreed-0\" ])[1]";
        driver.findElement(By.xpath(i_Agree)).click();
        
     // Submit the form
        String submit ="(//button[ text()='Submit' ])[1]";
        driver.findElement(By.xpath(submit)).click();
        
     // Check for error message
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//*[text()='Sorry, there was an error submitting the form. Please try again.']")); 
            Assert.assertNotNull(errorMessage);
            System.out.println("Test PASS");
        } catch (NoSuchElementException e) {
            System.out.println("Test FAIL");
        }

        driver.quit();
        
        
	}

}
