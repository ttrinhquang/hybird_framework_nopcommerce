package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.CustomerInforPageUI;
import pageUIs.nopCommerce.user.HomePageUI;
import pageUIs.nopCommerce.user.RewardPointPageUI;

public class UserRewardPointPageObject extends BasePage {

	private WebDriver driver;

	public UserRewardPointPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
