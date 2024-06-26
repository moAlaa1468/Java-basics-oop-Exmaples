package abstraction;

public class Dog extends Animal{

    @Override
    protected void eat(){
        System.out.println("This is the jsut the eat method");
    }

    @Override
    public void display(){
        System.out.println("This is the dog Class ");
    }
}
