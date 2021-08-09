package peachfinance.qa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Start {

    public static Performable onTheHomePage() {
        return Task.where("{0} on the home page",
                Open.browserOn().thePageNamed("home.page")
                //Check.whether(TheTrackingConsent.isDisplayed()).andIfSo(Click.on(Home.TRACKING_CONSENT_NO_BUTTON)).otherwise(),
                //Click.on(Home.COOKIES_WARNING_ACCEPT_BUTTON)
        );
    }

}