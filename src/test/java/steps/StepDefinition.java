package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ButtonFunPage;
import pages.TestBase;

public class StepDefinition extends TestBase{

	ButtonFunPage buttonfunpage;
	@Before
	public void backgroundColor() {
		initDriver();
		buttonfunpage= PageFactory.initElements(driver, ButtonFunPage.class);
	}
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		driver.get("https://techfios.com/test/101/"); 
		buttonfunpage.buttonexists();	
		
	}

	@When("^I click on the button$")
	public void i_click_on_the_button()   {
		buttonfunpage.clickOnSkyBlueButton();
	    
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		buttonfunpage.validateSkyBlueColor();
	}
	
	
	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists()  {
		driver.get("https://techfios.com/test/101/");
		buttonfunpage.buttonexistsw();
	}

	@When("^I click on the white button$")
	public void i_click_on_the_white_button()  {
		buttonfunpage.clickOnWhiteButton();
	}

	@Then("^the background color will change to White$")
	public void the_background_color_will_change_to_White()  {
		buttonfunpage.validatewhiteColor();  
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}



	}

