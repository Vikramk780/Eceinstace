package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver Idriver;

	public LoginPage(WebDriver rDriver) {
		Idriver=rDriver;

		PageFactory.initElements(rDriver, this);

	}
	
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement email;
	
	
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//strong[contains(text(),\"Login\")]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),\"Accounts\")]")
	private WebElement logoutasbotpriselink;
	
	public void EnterEmail(String emailadd) {
		email.sendKeys(emailadd);
	}
	
	public void ENterPasword(String passwordadd) {
		password.sendKeys(passwordadd);
	}
	
	public void clickOnLoginBtn() {
		loginbtn.click();
		String tittle=Idriver.getTitle();
		System.out.println(tittle);
		
	}
	
	public void clickonLogout() {
		logoutasbotpriselink.getText();
	}

}
