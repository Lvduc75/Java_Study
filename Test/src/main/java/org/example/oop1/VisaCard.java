package org.example.oop1;

public class VisaCard implements PaymentGateway{
    @Override
    public void payment() {
        System.out.println("Payment with Visa Card");
    }
}
