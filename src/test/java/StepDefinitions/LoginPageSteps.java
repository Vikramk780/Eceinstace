package StepDefinitions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;
import PageObjects.LoginPage;
import Utilities.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {

	public WebDriver driver;
	public LoginPage loginPage;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	Properties prop;
	DriverFactory driverFactory = new DriverFactory(); 

	
	@Given("user Launch hrome browser")
	public void user_launch_hrome_browser() {
		
		
	

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		loginPage = new LoginPage(driver);
		
		
//		prop=configFileReader.init_prop();
//		String browename = prop.getProperty("browser");
//		System.out.println();
//		
//		driver =driverFactory.init_driver(browename);

	}

	@When("user Opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {

		loginPage.EnterEmail(email);
		loginPage.ENterPasword(pwd);
	}

	@When("click on login")
	public void click_on_login() {

		loginPage.clickOnLoginBtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String titlee) {

		Assert.assertEquals(titlee,"Botprise Staging");
		
	}

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() {
		loginPage.clickonLogout();

	}

	@When("Close browser")
	public void close_browser() {
      driver.close();
	}
}
