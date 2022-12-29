package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.CustomerInforPageUI;
import pageUIs.nopCommerce.user.HomePageUI;

public class UserMyProductReviewPageObject extends BasePage {

	private WebDriver driver;

	public UserMyProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
