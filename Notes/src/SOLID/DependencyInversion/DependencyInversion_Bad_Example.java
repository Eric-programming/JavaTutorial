package SOLID.DependencyInversion;

/**
 * If we have a class that has a dependency, and that dependency must have
 * predefined interface. So if we ever want to change our dependency, we will
 * depend on the interface that we create instead of the dependency
 */
public class DependencyInversion_Bad_Example {
    public static void main(String[] args) {

    }
}

class Online_Store_Bad_Example {

    public Online_Store_Bad_Example() {
        super();
    }

    public void makeAPaymentForAComputer(int quantity) {

    }
}

class Paypal {
    public Paypal() {
        super();
    }

    public void makeAPaymentWithPaypal(int total) {
        System.out.println("Paid => " + total + " by Paypal");
    }
}

class Stripe {
    public Stripe() {
        super();
    }

    public void makeAPaymentWithStripe(int total) {
        System.out.println("Paid => " + total + " by Paypal");
    }
}
