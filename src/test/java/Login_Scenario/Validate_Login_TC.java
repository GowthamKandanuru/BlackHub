package Login_Scenario;

import org.testng.annotations.Test;

import Interactions.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Validate_Login_TC {
	
	LoginPage lp;
  @Test
  public void LoginTest() {
	  lp.VerifyLogin();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  lp = new LoginPage();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
