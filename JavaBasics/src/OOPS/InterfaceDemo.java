package OOPS;

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done via UPI");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay();
    }
}

