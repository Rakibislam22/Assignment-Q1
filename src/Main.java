abstract class Payment{
    abstract void processPayment(double amount);
    void paymentSuccess(){
        System.out.println("Payment completed successfully!");
    }
}

class CreditCardPayment extends Payment{
    @Override
    void processPayment(double amount){
        System.out.println("Processing credit card payment of $"+amount);
    }
}

class MobileBankingPayment extends Payment{
    @Override
    void processPayment(double amount){
        System.out.println("Processing mobile banking payment of $"+amount);
    }
}

public class Main {
    public static void main(String[] args){
        CreditCardPayment pay1 = new CreditCardPayment();
        MobileBankingPayment pay2 = new MobileBankingPayment();
        pay1.processPayment(400);
        pay1.paymentSuccess();
        pay2.processPayment(500);
        pay2.paymentSuccess();
    }
}