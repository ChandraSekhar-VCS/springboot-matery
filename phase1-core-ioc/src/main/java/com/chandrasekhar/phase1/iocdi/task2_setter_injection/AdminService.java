package com.chandrasekhar.phase1.iocdi.task2_setter_injection;

public class AdminService {
    private LoggingService loggingService;

    public void setLoggingService(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    public void performAdminTask(String message) {
        loggingService.log(message);
    }
}
