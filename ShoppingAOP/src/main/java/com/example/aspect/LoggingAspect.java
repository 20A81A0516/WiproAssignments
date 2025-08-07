package com.example.aspect;

public class LoggingAspect {

    public void logBefore() {
        System.out.println("[BEFORE] Method is about to execute.");
    }

    public void logAfterReturning() {
        System.out.println("[AFTER RETURNING] Method executed successfully.");
    }

    public void logAfterThrowing() {
        System.out.println("[AFTER THROWING] Exception occurred during method execution.");
    }

    public void logAround() {
        System.out.println("[AROUND] Measuring execution time (simulated).");
    }
}
