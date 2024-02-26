public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        payment
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    private double payment(double cost, double payment){
        if(payment<=2.5){
            affordableMeals++;
            money += payment;
            return payment-2.5;
        }
        else{
            return payment;
        }
    }
}
