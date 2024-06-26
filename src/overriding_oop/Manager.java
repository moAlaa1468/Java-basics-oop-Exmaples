package overriding_oop;
import overriding_oop.Employee;
// Subclass: Manager
public class Manager extends Employee {
    private double bonus;

    public Manager(){}
    public Manager(String name, double baseSalary, double bonus){
        super(name,baseSalary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }
    //
    @Override
   public void display(){
        super.display();
        System.out.println("The bonus of teh mananger is : "+bonus);
    }
    public void different(){
        System.out.println("this function is not hte parent class");
    }
}