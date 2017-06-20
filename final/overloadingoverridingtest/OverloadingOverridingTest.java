package overloadingoverridingtest;
public class OverloadingOverridingTest {
    public static void main(String[] args) {     
        Loan cheapLoan = Loan.createLoan("HSBC");
        Loan veryCheapLoan = Loan.createLoan("Citibank", 8.5);     
        System.out.println(cheapLoan);
        System.out.println(veryCheapLoan);
        PersonalLoan pLoan = new PersonalLoan();
        System.out.println(pLoan);    } }
