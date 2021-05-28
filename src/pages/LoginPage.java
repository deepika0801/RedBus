package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "i-icon-profile")
	WebElement loginIcon;
 
	@FindBy(id = "signInLink")
	WebElement singIn;

	@FindBy(id = "mobileNoInp")
	WebElement mobileNo;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginApp(String mobile) throws InterruptedException {

		loginIcon.click();

		singIn.click();

		System.out.println(mobile);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		mobileNo.sendKeys(mobile);
	}

}
