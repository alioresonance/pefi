package peachfinance.qa.user_interface;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class LoanDetail {

    public static final Target LOAN_ID = Target.the("the loan id")
            .locatedBy("#root > div > div.main-content > div > section.loan-detail > span")
            .waitingForNoMoreThan(Duration.ofSeconds(30));
}