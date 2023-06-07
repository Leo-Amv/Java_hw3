package ru.gb;

import java.util.Comparator;

public class HourlyWorker extends BaseWorker implements Comparator<HourlyWorker> {
    private String name;
    private final double rate;
    @Override
    public double avgMonthlySalary() {
        return 20.8 * 8 * rate;
    }

    public HourlyWorker(double rate) {
        this("noname",rate);
    }

    public HourlyWorker(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(HourlyWorker o1, HourlyWorker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
