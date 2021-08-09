package peachfinance.qa.model;

public class Borrower {
    public static User random() {
        long unique = System.currentTimeMillis();
        User random = new User();
        random.setEmail("qa+" + unique + "@gmail.com");
        random.setPassword("SpongeB0b!");
        random.setLoanID("LN-" + unique);
        return random;
    }

    public static User bobby() {
        User bobby = new User();
        bobby.setEmail("bobby@peach.finance");
        bobby.setPassword("hello12345");
        bobby.setLoanID("LN-4QBW-Q3BW");
        return bobby;
    }
}
