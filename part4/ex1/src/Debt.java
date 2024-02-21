public class Debt {
    private double interest = 0;
    private double debt = 0;
    public Debt(double initialDebt, double initialInterest){
        debt = initialDebt;
        interest = initialInterest;
    }
    public void printBalance(){
        System.out.println(debt);
    }
    public void waitOneYear(){
        debt *= interest;
    }


}
