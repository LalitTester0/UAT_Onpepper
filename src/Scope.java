import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement coloumndriver = footer.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		int columnsize = coloumndriver.findElements(By.tagName("a")).size();
		System.out.println(columnsize);
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++) {
			String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(key);
			Thread.sleep(5000L);
		}
			Set<String> win = driver.getWindowHandles();
			Iterator<String> it = win.iterator();
			while(it.hasNext()) {
				System.out.println(driver.switchTo().window(it.next()).getTitle());
			}
			
		}
		
		
		
	}


