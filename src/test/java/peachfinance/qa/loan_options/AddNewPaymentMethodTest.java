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
import peachfinance.qa.model.Borrower;
import peachfinance.qa.model.User;
import peachfinance.qa.tasks.FromAccountLogin;
import peachfinance.qa.tasks.Start;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("Smoke"),
        @WithTag("Acceptance"),
        @WithTag("Loan Options"),
        @WithTag("Add New Payment Method"),
        @WithTag("version:RELEASE-1")
})
public class AddNewPaymentMethodTest {

    private final Actor bobby = Actor.named("Bobby");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void init() {

        bobby.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_be_able_to_add_payment_method() {

        // TODO: later refactor to dependency-inject role via Actor
        User theBorrower = Borrower.bobby();
        //String welcomeFirstname = TheGreeting.expected(randomUser.getFirstname());

        givenThat(bobby).wasAbleTo(
                Start.onTheHomePage().then(FromAccountLogin.signInAs(bobby, theBorrower)));
//        when(bobby).attemptsTo(
//                CreateAnAccount.asSome(randomUser));
//        then(bobby).should(
//                seeThat(TheGreeting.displayed(), is(welcomeFirstname))
//        );
    }
}
