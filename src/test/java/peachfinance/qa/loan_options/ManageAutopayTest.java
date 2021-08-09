package peachfinance.qa.loan_options;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import peachfinance.qa.model.User;
import peachfinance.qa.questions.TheGreeting;
import peachfinance.qa.tasks.CreateAnAccount;
import peachfinance.qa.tasks.Start;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("Smoke"),
        @WithTag("Acceptance"),
        @WithTag("Loan Options"),
        @WithTag("Manage Autopay"),
        @WithTag("version:RELEASE-1")
})
public class ManageAutopayTest {

    private final Actor bobby = Actor.named("Bobby");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void init() {

        bobby.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_be_able_to_add_payment_method() {

//        User randomUser = Random.user();
//        String welcomeFirstname = TheGreeting.expected(randomUser.getFirstname());
//
//        givenThat(bobby).wasAbleTo(
//                Start.onTheHomePage().then(FromSignIn.gotoCreateAccount()) );
//        when(bobby).attemptsTo(
//                CreateAnAccount.asSome(randomUser));
//        then(bobby).should(
//                seeThat(TheGreeting.displayed(), is(welcomeFirstname))
//        );
    }
}
