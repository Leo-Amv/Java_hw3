package ru.gb;

public class Main {
    public static void main(String[] args) {
        BaseWorker [] workers = {
                new HourlyWorker(15),
                new FixedWorker(3000)
        };
        for (BaseWorker worker: workers) {
            System.out.println(worker.avgMonthlySalary());
        }
    }
}