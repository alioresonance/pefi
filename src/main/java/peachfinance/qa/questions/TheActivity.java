package peachfinance.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import peachfinance.qa.user_interface.LoanDetail;

public class TheActivity implements Question<String> {

    public static Question<String> displayedLoanID() {
        return Text.of(LoanDetail.LOAN_ID)
                .describedAs("the displayed loan id")
                .asAString();
    }

    public static String expected(String name) {
        return String.format("Welcome, %s.", name);
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}