package com.chandrasekhar.phase1.iocdi.task4_ioc_in_action;

public class ModernOrderService {
    private final PaymentService paymentService;
    // This is loosely coupled, we have a flexibility to use any type of payment service in future
    public ModernOrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processOrder(){
        paymentService.processPayment();
        System.out.println("Order has been processed successfully");
    }
}
