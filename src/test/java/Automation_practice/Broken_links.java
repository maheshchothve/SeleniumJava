

package Automation_practice;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Broken_links {

	public static void main(String[] args) {
		WebDriver driver=(WebDriver) new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int no_of_links=links.size();
		System.out.println("total number of links on the page:"+no_of_links);
		
		for(WebElement weblink:links) {
			String hreflinks=weblink.getAttribute("href");
			
			if(hreflinks ==null || hreflinks.isBlank()) {
				System.out.println("not possible to check link");
				continue;
			}
				
			
		}
		
		
	
		

	}

}
