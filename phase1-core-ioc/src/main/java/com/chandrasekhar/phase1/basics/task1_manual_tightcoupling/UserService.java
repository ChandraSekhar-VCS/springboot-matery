package com.chandrasekhar.phase1.basics.task1_manual_tightcoupling;

public class UserService {
    private NotificationService notificationService;

    public UserService(){ // TIGHT COUPLING
        this.notificationService = new NotificationService();
    }

    public void regiseterUser(String userName){
        System.out.println("User registered: "+userName);
        notificationService.send(" Welcome " + userName);
    }
}
