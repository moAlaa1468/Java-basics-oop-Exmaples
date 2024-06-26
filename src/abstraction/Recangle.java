package abstraction;

public class Recangle extends Shape{

    private double width;
    private double length;

    public Recangle(){}

    public Recangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void display(){
        super.display();
        System.out.println("The width is : "+width);
        System.out.println("The width is : "+length);

    }


    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return width * length;
    }
    public double calculatePerimeter(){
        return (width+length)*2 ;
    }
}
