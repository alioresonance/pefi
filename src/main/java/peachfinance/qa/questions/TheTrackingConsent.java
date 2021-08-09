package peachfinance.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import peachfinance.qa.user_interface.Home;

public class TheTrackingConsent implements Question<String> {

    public static Question<Boolean> isDisplayed() {
        return Visibility.of(Home.TRACKING_CONSENT_NO_BUTTON)
                .describedAs("the tracking consent no button")
                .asABoolean();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}