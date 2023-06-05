package ru.gb;

public class HourlyWorker extends BaseWorker{
    private final double rate;
    @Override
    public double avgMonthlySalary() {
        return 20.8 * 8 * rate;
    }

    public HourlyWorker(double rate) {
        this.rate = rate;
    }
}
