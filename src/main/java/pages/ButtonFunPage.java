package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ButtonFunPage {
	static WebDriver driver;

	public ButtonFunPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@type='button']")
	WebElement SETSKYBLUEBGBUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SETWHITEBGBUTTON;

	/*
	 * @FindBy(how=How.XPATH,using="/html/body]") WebElement BACKGROUND;
	 */

	public void buttonexists() {  
		SETSKYBLUEBGBUTTON.isDisplayed();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSkyBlueButton() {
		SETSKYBLUEBGBUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void validateSkyBlueColor() {
		System.out.println("background color changes to white");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void buttonexistsw() {
		SETWHITEBGBUTTON.isDisplayed();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWhiteButton() {
		SETWHITEBGBUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void validatewhiteColor() {
		System.out.println("background color changes to white ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
