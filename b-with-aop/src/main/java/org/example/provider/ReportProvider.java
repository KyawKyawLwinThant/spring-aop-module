package org.example.provider;

import org.example.annotation.PerformanceMetric;
import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component @PerformanceMetric
public class ReportProvider {
    public Report provideReport(){
        System.out.println("Report Provided.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Report();
    }
}
