public class Rectangle {
    private double width;
    private double height;


    //setter functions
    public Rectangle setWidth(double x){
        if(x<0){
            System.out.println("Please enter a positive value");
        }else{
            width=x;
        }
        return this;
    }
    public void setHeight(double z){
        if(z<0){
            System.out.println("Please enter a positive value");
        }else{
            height=z;
        }
    }

    //getters of this class
    public double getHeight() {
        return height;
    }
    public double getWidth(){
        return width;
    }

    public double area(){
        return this.width*this.height;
    }
    public double perimeter(){
        if (width==0 || height==0){
            System.out.println("please enter a positive number for widht and height");
            return 0.0;
        }  else
        return 2*(width + height);
    }

    // returning the class itself
    public Rectangle getRectangleInstance(){
        return this;
    }
}
