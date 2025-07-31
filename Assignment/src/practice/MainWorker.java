package practice;

class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double rate) {
        this.name = name;
        this.salaryRate = rate;
    }

    public double pay(int hours) {
        return 0.0; 
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double pay(int days) {
        return days * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double pay(int hours) {
        return 40 * salaryRate; // Always 40 hours pay
    }
}

public class MainWorker {
    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker("Ravi", 500);
        SalariedWorker sw = new SalariedWorker("Neha", 400);

        System.out.println("Daily Worker Pay (5 days): Rs." + dw.pay(5));
        System.out.println("Salaried Worker Pay (any hours): Rs." + sw.pay(60));
    }
}



/*
Daily Worker Pay (5 days): Rs.2500.0
Salaried Worker Pay (any hours): Rs.16000.0
*/