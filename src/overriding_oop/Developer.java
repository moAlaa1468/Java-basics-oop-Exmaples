
package overriding_oop;
import overriding_oop.Employee;
// Subclass: Developer
public class Developer extends Employee {
    private int workedHours;
    private double hourPrice;

    public Developer(){}
   public  Developer(String name, double baseSalary, int workedHours,double hourPrice){
        super(name,baseSalary);
        this.workedHours=workedHours;
        this.hourPrice=hourPrice;

    }

    @Override
    public double calculateSalary(){
        int overTimeHours=workedHours-40;
        double overTimeHoursPrice=overTimeHours*50*1.5;
        return overTimeHoursPrice+getBaseSalary();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The worked Hours For developer is :"+workedHours);

    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }
}
