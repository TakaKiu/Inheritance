import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        
        ArrayList<Worker> workers = new ArrayList<>();


        workers.add(new Worker("John", "Doe", "W1", "Mr.", 1985, 15.0));
        workers.add(new Worker("Alice", "Smith", "W2", "Mrs.", 1990, 20.0));
        workers.add(new Worker("Bob", "Johnson", "W3", "Mr.", 1980, 18.0));


        workers.add(new SalaryWorker("Eva", "Brown", "S1", "Mrs.", 1975, 0.0, 52000.0));
        workers.add(new SalaryWorker("Charlie", "Davis", "S2", "Mr.", 1995, 0.0, 60000.0));
        workers.add(new SalaryWorker("Grace", "Wilson", "S3", "Ms.", 1988, 0.0, 55000.0));


        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s%-10s%-15s%n", "Name", "Title", "Weekly Pay");
            System.out.println("------------------------------------------------------------");


            for (Worker worker : workers) {
                double weeklyPay = worker.calculateWeeklyPay(week == 2 ? 50 : 40);
                String fullName = worker.getFirstName() + " " + worker.getLastName();
                System.out.printf("%-20s%-10s$%.2f%n", fullName, worker.getTitle(), weeklyPay);
            }

            System.out.println("------------------------------------------------------------");
            System.out.println();
        }
    }
}
