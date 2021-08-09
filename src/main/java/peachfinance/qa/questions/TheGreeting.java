package peachfinance.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import peachfinance.qa.user_interface.Welcome;

public class TheGreeting implements Question<String> {

    public static Question<String> displayed() {
        return Text.of(Welcome.GREETING)
                .describedAs("the greeting")
                .asAString();
    }

    public static String expected(String name) {
        return String.format("WelcoXXXme, %s.", name);
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}