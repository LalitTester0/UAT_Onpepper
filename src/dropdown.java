import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		WebElement dr=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]"));
		dr.click();
		Thread.sleep(2000);
		
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(dr.getText());
		

	}

}
