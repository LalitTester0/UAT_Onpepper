import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stream2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//tr//td[1]"));
		
		List<String> elementtext = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedelement = elementtext.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(elementtext.equals(sortedelement));
		
		
		 List<String> price = elements.stream().filter(s ->s.getText().contains("Beans")).map(s ->getpricevegie(s)).collect(Collectors.toList());
		price.stream().forEach(a->System.out.println(a));
	}

	private static String getpricevegie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
