package abstraction;

public abstract class Shape {


    abstract public double calculateArea();
    abstract public double  calculatePerimeter();
    public  void display(){
       System.out.println("This is new Shape");
   }
}
