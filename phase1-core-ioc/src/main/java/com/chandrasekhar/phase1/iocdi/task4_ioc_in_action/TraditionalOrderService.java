package com.chandrasekhar.phase1.iocdi.task4_ioc_in_action;

public class TraditionalOrderService {
    private final PaymentService paymentService;
    //tightly coupled we cannot use a different type of payment service if required
    public TraditionalOrderService() {
        this.paymentService = new PaymentService();
    }
    public void porcessOrder(){
        paymentService.processPayment();
        System.out.println("Order has been processed successfully");
    }
}
