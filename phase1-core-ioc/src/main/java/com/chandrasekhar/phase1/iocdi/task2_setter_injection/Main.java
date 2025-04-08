package com.chandrasekhar.phase1.iocdi.task2_setter_injection;

public class Main {
    public static void main(String[] args) {
        LoggingService loggingService = new LoggingService();
        AdminService adminService = new AdminService();
        adminService.setLoggingService(loggingService);
        adminService.performAdminTask("This is a test message");
    }
}
