public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {

        return annualSalary / 52.0;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "Weekly Pay (Salary): $ " + calculateWeeklyPay(hoursWorked);
    }
}