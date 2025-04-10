import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://outlook.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("flairmindsnew@outlook.com");
		
		driver.findElement(By.xpath("//input[@value=\"Next\"]")).click();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("passwd"));
		
		pass.sendKeys("Flair@123");
		pass.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//data-report-value=\"Submit\"]")).click();

		driver.findElement(By.xpath("//input[@value=\"Yes\"]")).click();
		Thread.sleep(8000);
		WebElement searchbox = driver.findElement(By.id("topSearchInput"));
		searchbox.sendKeys("Jadhav");
		Thread.sleep(2000);
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=\"Jadhav\"]")).click();
		
		
	}

}
