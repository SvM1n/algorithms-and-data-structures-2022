package practice.part3;

public class Employee {
    private String fullname;
    private double salary;

    Employee() {
        this.fullname = "noname";
        this.salary = 0;
    }

    Employee(String name, double salary) {
        this.fullname = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
