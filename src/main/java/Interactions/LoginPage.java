package Interactions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.Base;

public class LoginPage extends Base{
	
	public void VerifyLogin()
	{
		driver.get("https://www.freecrm.com/");
		wait.until(ExpectedConditions.visibilityOf(lp.login));
		lp.login.click();
		//wait.until(ExpectedConditions.elementToBeClickable(lp.login));
	}

}
