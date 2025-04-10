
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class dropdown2 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://bmpdtravel.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Book")).click();
			WebElement traveler=driver.findElement(By.className("FlightBookingForm_selectedTraveler__bKaqK"));
			Thread.sleep(2000);
			System.out.println(traveler.getText());
			traveler.click();

			 
			 int i=1;
			 while(i<5) {
				driver.findElement(By.xpath("//div[@class='FlightBookingForm_travelerDropDown__llsaS']//div[2]//div[1]//span[3]")).click();
				 i++;
			 }
			 Thread.sleep(2000);
			 traveler.click();
			 System.out.println(traveler.getText());
			 driver.close();
		}

	}


