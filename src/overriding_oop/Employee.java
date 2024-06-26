package overriding_oop;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(){
        System.out.println("non-parameterized constructor called; ");
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }
    public void display(){
        System.out.println("The name of the employee is : "+name);
        System.out.println("The base Salary of the employee is : "+baseSalary);
    }

}