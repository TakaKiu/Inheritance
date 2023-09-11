public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }

        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay;
        double overtimePay;
        double totalPay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }

        totalPay = regularPay + overtimePay;

        return "Regular Pay (40 hours): $" + regularPay + "\n" +
                "Overtime Pay: $" + overtimePay + "\n" +
                "Total Pay: $" + totalPay +
                "\nTitle: " + getTitle();
    }

    public String getFirstName() {
        return super.firstName;
    }
    public String getTitle() {
        return super.title;
    }
    public String getLastName() {
        return super.lastName;
    }

}
