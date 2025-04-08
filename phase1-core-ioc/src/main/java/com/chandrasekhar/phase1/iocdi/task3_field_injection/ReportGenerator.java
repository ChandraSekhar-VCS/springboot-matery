package com.chandrasekhar.phase1.iocdi.task3_field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
    @Autowired
    AnalyticsService analyticsService;

    public void generateReport(String reportName){
        analyticsService.trackEvent("Report Generation of " + reportName);
    }
}
