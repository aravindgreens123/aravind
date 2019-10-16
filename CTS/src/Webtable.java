import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\CTS\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();

		/*
		 * List<WebElement> row = driver.findElements(By.xpath("//tr"));
		 * 
		 * 
		 * for(WebElement rows : row)
		 * 
		 * { System.out.println(rows.getText()); }
		 * 
		 * 
		 * WebElement data = driver.findElement(By.xpath("//tr[3]/td[3]"));
		 * 
		 * System.out.println(data.getText());
		 * 
		 */
		
	/*	List<WebElement> country = driver.findElements(By.xpath("//select[@name='country']"));
		
		for(WebElement all :country)
			
		{
			String text = all.getText();
			
			System.out.println(text);
			
			
		}*/
		
		Select s = new Select(driver.findElement(By.name("country")));
		
		//s.selectByValue("BELGIUM");
		
		//s.selectByVisibleText("BELGIUM");
		
		Actions acc = new Actions(driver);
		
		List<WebElement> country = driver.findElements(By.name("country"));
		
		for(WebElement all :country)
			
			
		{
			if(all.getText().equals("BELGIUM"))
				
			{
				
			
				all.click();
			}
			
			else
			{
				System.out.println("not found");
			}
			
			System.out.println(all.getText());
		}
		
		
		
		
		
		
				
		

	}

}
