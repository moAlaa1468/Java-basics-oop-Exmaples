package abstraction;

public class Circle extends Shape{

    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
     public double calculateArea(){
       return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return Math.PI * radius * 2;
    }

    public void display(){
        super.display();
        System.out.println("The radius of this circle is : "+radius);
    }
}
