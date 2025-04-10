import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"));
		String name = checkbox.getText();
		System.out.println(checkbox.getText());
		checkbox.click();
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select a=new Select(drop);
		a.selectByVisibleText(name);
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String text = (driver.switchTo().alert().getText());
		
		  if(text.contains(name))

		     {

		    System.out.println("Alert message success");

		     }

		     else

		    System.out.println("Something wrong with execution");

		}
	}

