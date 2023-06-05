package ru.gb;

public class FixedWorker extends BaseWorker{
    private final double rate;
    @Override
    public double avgMonthlySalary() {
        return rate;
    }

    public FixedWorker(double rate) {
        this.rate = rate;
    }
}
