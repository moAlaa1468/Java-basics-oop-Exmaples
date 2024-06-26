package copying;

public class Rectangle {
        private double length;
        private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //coping constructor
    public Rectangle(Rectangle ObjectThatContainsValuesAndYouWantToCopyFrom){
        this.width=ObjectThatContainsValuesAndYouWantToCopyFrom.width;
        this.length=ObjectThatContainsValuesAndYouWantToCopyFrom.length;
    }

    // Method for copying
    public Rectangle copy(){
        return new Rectangle(this.length,this.width);
    }

    public boolean compare(Rectangle other){
        if(this.length==other.length && this.width==other.width){
            return true;
        }else{
            return false;
        }
    }


    public double calcArea(){
        return this.width*this.length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
