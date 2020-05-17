package Login_Scenario;

import Interactions.LoginPage;

import org.testng.annotations.*;

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
	 // lp.closeBrowser();  
  }

}
