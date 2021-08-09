package peachfinance.qa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import peachfinance.qa.model.User;
import peachfinance.qa.user_interface.CreateAccount;

public class CreateAnAccount {
    public static Performable asSome(User user) {
        return Task.where("{0} creates an account as user: " + user.getEmail(),
                Enter.theValue(user.getEmail()).into(CreateAccount.EMAIL_FIELD),
                Enter.theValue(user.getPassword()).into(CreateAccount.PASSWORD_FIELD),
                Enter.theValue(user.getPassword()).into(CreateAccount.CONFIRM_PASSWORD_FIELD),
                Click.on(CreateAccount.STAY_UPDATED_CHECKBOX),
                Click.on(CreateAccount.CREATE_ACCOUNT_BUTTON)
        );
    }
}