package Automation_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;
public class TestNG {

	
		@Test(priority=-1,dataProvider="dp")
		void  start(String mail,String pass) throws Exception
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(mail);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
			
			String title=driver.getTitle();
			System.out.println("title of the page is:-"+title);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Define the destination path for the screenshot
            File destination = new File("C:\\Users\\Mahesh_Chothve.ITA-003\\eclipse\\Selenium_Automation\\Screenshot\\scr.png");

            // Copy the screenshot to the desired location
            
            Files.copy(screenshot, destination);
			
			
			System.out.println("start browser");
		}
		
		@DataProvider(name="dp")
		Object[][] logindata(){
			
			Object[][] data= {
					{"Admin","admin123"},
					{"Admin1","admin1234"},
					{"Admin2","admin12345"},
					{"Admin3","admin123456"},
			
			};
		
			return data;
		}
		
		
		@Test(priority=0)
		void login() 
		{
			System.out.println("login to app");
		}
		@Test(priority=-2)
		void end()
		{
			System.out.println("end the task");
		}
		
	}

	

