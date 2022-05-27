package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.CreditAvailable;
import starter.dashboard.OverviewData;
import starter.login.Dologin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepsDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) has an active account")
    public void has_an_active_account(String name) {
        // Write code here that turns the phrase above into concrete actions
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                Dologin.withCredentials("pepito","algo")
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
        // Write code here that turns the phrase above into concrete actions

        //System.out.println("-------"+CreditAvailable.value().answeredBy(theActorInTheSpotlight()));
        //System.out.println("*******"+OverviewData.creditAvailable().answeredBy(theActorInTheSpotlight()));

        theActorInTheSpotlight().should(
                seeThat("the displayed credit available",OverviewData.creditAvailable(),equalTo("$17,800")),
                seeThat("the displayed total balance",OverviewData.totalBalance(),equalTo("$17,800")),
                seeThat("the displayed credit available",OverviewData.creditAvailable(),equalTo("$17,800"))
        );

    }
}
