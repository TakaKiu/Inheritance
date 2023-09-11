public class Person {
    public String firstName;
    public String lastName;
    private String ID;
    public String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - YOB;
    }

    public int getAge(int year) {
        return year - YOB;
    }
}