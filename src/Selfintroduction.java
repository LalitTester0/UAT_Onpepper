import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selfintroduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.quit();
		
		
		
	}

}
