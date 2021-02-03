

	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	

public class Test {
		public static void main(String[] args) throws InterruptedException {
				
			System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://automation-test.peoplegrove.com/hub/automation-test/home");
			
			
			driver.findElement(By.xpath("//button[@class=\"md-raised md-primary email md-button md-ink-ripple\"]")).click();
			
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("poladwarnitesh91@gmail.com");
			
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Nitesh007");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			driver.manage().window().maximize();	
			
			Thread.sleep(5000);
			Actions act =new Actions(driver);			
			
			WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Opportunity')]"));
			
			act.moveToElement(ele).click().build().perform();			
			
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

			List<WebElement>ListofJobs=driver.findElements(By.xpath("//div[@class='job-card__content']"));
			
			System.out.println("List of jobs is:"+ListofJobs.size());
			
			for (WebElement EachNum:ListofJobs)
			{
				System.out.println(EachNum.getText());
			}		
			
	

		}
}


