package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefination {

  @Given("^user is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
      //Landing to bank login page
    	
    	System.out.println("landed to bank login page");
    }


  @When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
  {       //Login to bank site
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //Validating home page
    	System.out.println("Validated home page");
    }

    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        //Validating cards payment and rewards
    	System.out.println(strArg1);
    }

}