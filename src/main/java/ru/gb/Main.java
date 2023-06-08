package ru.gb;

public class Main {
    public static void main(String[] args) {
        BaseWorker [] workers = {
                new HourlyWorker("Petr",15),
                new HourlyWorker("Alex",17),
                new HourlyWorker("Igor",16),
                new FixedWorker("Leo",3000),
                new FixedWorker("Maks",2800),
                new FixedWorker("Vlad",2900)
        };
//        for (BaseWorker worker: workers) {
//            System.out.println(worker.avgMonthlySalary());
//        }
        WorkersArray workersArray = new WorkersArray(workers);
        workersArray.printWorkers();
    }
}