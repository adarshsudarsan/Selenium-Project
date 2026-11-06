package keralapagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement loginbtn;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String titlemethod() {
		String title=driver.getTitle();
		return title;
		
	}
	public void LoginMethod(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbtn.click();
	}


}
