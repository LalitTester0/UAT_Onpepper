import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class locatorpractise2 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pass=Getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String logintext=(driver.findElement(By.tagName("p")).getText());
		//System.out.println(logintext);
		org.testng.Assert.assertEquals(logintext, "You are successfully logged in.");
		String loginname=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		//System.out.println(loginname);
		//org.testng.Assert.assertEquals(loginname, "Hello rahul,");
		
		driver.close();
	}
	public static String  Getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String Passwordtext=(driver.findElement(By.cssSelector("form p")).getText());
		System.out.println(Passwordtext);
		String[] passwordarray=Passwordtext.split("'");
		
		String mainpass=(passwordarray[1]);
		System.out.println(mainpass);
		return mainpass;
	}
}
