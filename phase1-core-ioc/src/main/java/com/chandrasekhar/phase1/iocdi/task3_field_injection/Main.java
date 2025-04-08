package com.chandrasekhar.phase1.iocdi.task3_field_injection;

public class Main {
    public static void main(String[] args) {
        AnalyticsService analyticsService = new AnalyticsService();
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport("Student learning Report");
    }
}
