package ru.gb;

import java.util.Comparator;

public class FixedWorker extends BaseWorker implements Comparator<FixedWorker> {
    private String name;
    private final double rate;
    @Override
    public double avgMonthlySalary() {
        return rate;
    }

    public FixedWorker(double rate) {
        this("noname",rate);
    }

    public FixedWorker(String name, double rate) {
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
    public int compare(FixedWorker o1, FixedWorker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
