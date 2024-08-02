package org.example.oop1;

public class AmexCard implements PaymentGateway{
    @Override
    public void payment() {
        System.out.println("Payment with Amex Card");
    }
}
