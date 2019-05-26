package AutoTests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CareersPage;
import Pages.HomePage;
 
/* This will class should have all the tests which needs to be carried out*/

public class HomeTest extends TestBase{
 
 @Test
 //Test to check if Careers page is loaded from Home Page
 public void validateCareers() throws Exception{
	 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	 homepage.clickOncareersLink();
 }
 
 @Test
 //Test to check if Job Description is shown correctly for UI Developer Opening.
 public void validateJobDesc() throws Exception{
	 CareersPage careerspage = PageFactory.initElements(driver, CareersPage.class);
	 careerspage.clickOnJobDescLink();
 }
}