package peachfinance.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import peachfinance.qa.model.User;
import peachfinance.qa.questions.TheActivity;
import peachfinance.qa.user_interface.AccountLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static org.hamcrest.CoreMatchers.is;

public class FromAccountLogin {

    public static Performable signInAs(Actor actor, User user) {
        return Task.where("{0} sign-in as user " + user.getEmail(),
                Click.on(AccountLogin.EMAIL_FIELD_UNFOCUSED)
                        .then(Enter.theValue(user.getEmail()).into(AccountLogin.EMAIL_FIELD)),
                Click.on(AccountLogin.PASSWORD_FIELD_UNFOCUSED)
                        .then(Enter.theValue(user.getPassword()).into(AccountLogin.PASSWORD_FIELD)),
                Click.on(AccountLogin.CONTINUE_BUTTON),
                then(actor).should(
                        seeThat(TheActivity.displayedLoanID(), is(user.getLoanID()))
                )
        );
    }
}