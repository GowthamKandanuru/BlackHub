package Interactions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.Base;

public class LoginPage extends Base{
	
	public void VerifyLogin()
	{
		driver.get("https://www.freecrm.com/");
		wait.until(ExpectedConditions.visibilityOf(lp.login));
		lp.login.click();
		lp.email.sendKeys(properties.getUsername());
		lp.password.sendKeys(properties.getPassword());
		lp.submit.click();
		//wait.until(ExpectedConditions.visibilityOf(lp.home));
		lp.home.click();
	}
	
	public void closeBrowser()
	{
		Base.close();
	}

}
