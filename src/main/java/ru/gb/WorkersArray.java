package ru.gb;

public class WorkersArray {
    private final BaseWorker [] workers;

    public WorkersArray(BaseWorker [] workers) {
        this.workers = workers;
    }
    public void printWorkers(){
        for (BaseWorker worker: workers) {
            if (worker instanceof HourlyWorker){
                System.out.printf("Name: %s, ",((HourlyWorker) worker).getName());
            } else if (worker instanceof FixedWorker) {
                System.out.printf("Name: %s, ",((FixedWorker) worker).getName());
            }
            System.out.printf("Salary: %f.",worker.avgMonthlySalary());
            System.out.println();
        }
    }
}
