public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        return(calculateChange(2.5, payment));
    }

    public double eatHeartily(double payment) {
        return (calculateChange(4.3, payment));
    }

    public boolean eatAffordably(PaymentCard card){
        return(calculateCard(2.5, card));
    }

    public boolean eatHeartily(PaymentCard card){
        return(calculateCard(2.5, card));
    }
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    private boolean calculateCard(double cost, PaymentCard card){
        if(card.balance() >= cost){
            switch((int)cost) {
                case(2):
                    affordableMeals++;
                    break;
                case(4):
                    heartyMeals++;
                    break;
            }
            card.takeMoney(cost);
            return (true);
        }
        return (false);
    }
    public void addedMoneyToCard(PaymentCard card, double money){
        card.addMoney(money);
    }

    private double calculateChange(double cost, double payment){
        if(payment<=cost){
            switch((int)cost) {
                case(2):
                    affordableMeals++;
                    break;
                case(4):
                    heartyMeals++;
                    break;
            }
            money += payment;
            return payment-cost;
        }
        else{
            return payment;
        }
    }
}
