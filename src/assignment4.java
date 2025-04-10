import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it = wind.iterator();
		String parent = it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();
	}

}
