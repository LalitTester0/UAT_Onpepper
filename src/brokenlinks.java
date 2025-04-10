import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
			SoftAssert a=new SoftAssert();
			//System.out.println(links.size());
			for(WebElement link:links) {
			String url=link.getAttribute("href");
			System.out.println(url);
			HttpsURLConnection conn = (HttpsURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The link with Text"+link.getText()+" is broken with code" +respcode);
			
			}
			a.assertAll();
	}

}
