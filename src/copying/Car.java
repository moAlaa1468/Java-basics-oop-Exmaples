package copying;

public class Car {
    private double weight;
    private double length;


    //method for copying
    public Car copy(){
        return new Car(this.weight,this.length);
    }

    //copy constructor
    public  Car(Car objectThatContainsValuesAndYouWantToCopyFrom){
        this.length=objectThatContainsValuesAndYouWantToCopyFrom.length;
        this.weight=objectThatContainsValuesAndYouWantToCopyFrom.weight;
    }

    //parameterized constructor
    public Car(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
