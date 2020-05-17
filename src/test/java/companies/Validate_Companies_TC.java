package companies;

import org.testng.annotations.*;


import Interactions.CompanySection;

public class Validate_Companies_TC {
	
	CompanySection cs;
	
	@Test
	  public void verifyAdd() {
		  cs.verifyAdd();
	  }
	  @BeforeTest
	  public void beforeTest() {
		  
		  cs = new CompanySection();
	  }

	  @AfterTest
	  public void afterTest() {
		 // cs.closeBrowser();  
	  }
	
}
