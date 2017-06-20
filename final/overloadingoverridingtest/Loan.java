package overloadingoverridingtest;
public class Loan {
    private double interestRate;
    private String customer;
    private String lender;
    public static Loan createLoan(String lender) {
        Loan loan = new Loan();
        loan.lender = lender;
        return loan;    }
    public static Loan createLoan(String lender, double interestRate) {
        Loan loan = new Loan();
        loan.lender = lender;
        loan.interestRate = interestRate;
        return loan;    }
    public String toString() {
        return "This is Loan by Citibank";   }}
