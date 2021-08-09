package peachfinance.qa.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class AccountLogin {

    private static String emailLabel = "#root > div > div > div > label:nth-child(1)";
    private static String passwordLabel = "#root > div > div > div > label:nth-child(2)";
    private static String continueButton = "#root > div > div > div > div > button";


    public static final Target EMAIL_FIELD_UNFOCUSED = Target.the("the email field (unfocused)").locatedBy(emailLabel);
    public static final Target EMAIL_FIELD = Target.the("the email field").locatedBy(emailLabel + "> input[name='email']");

    public static final Target PASSWORD_FIELD_UNFOCUSED = Target.the("the password field (unfocused)").locatedBy(passwordLabel);
    public static final Target PASSWORD_FIELD = Target.the("the password field").locatedBy(passwordLabel + "> input[name='password']");

    public static final Target CONTINUE_BUTTON = Target.the("the continue button").locatedBy(continueButton);
}