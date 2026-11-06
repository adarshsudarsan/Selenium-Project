package keralabasepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keralapagepackage.Loginpage;

public class BaseClass {
	
		
		public static WebDriver driver;
		
		public Loginpage loginobj;
		
		@BeforeTest
		public void setup() {
			driver =new ChromeDriver();
			driver.get("https://keralaproperty.in/member/login/");
			driver.manage().window().maximize();
		}

		@BeforeMethod
		public void objectmethod() {
			
			loginobj = new Loginpage(driver);
			
		}
}
