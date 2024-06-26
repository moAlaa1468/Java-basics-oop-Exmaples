package abstraction;

public abstract class Animal {

    protected abstract void eat();

    //abstract methods
    public abstract void display();

    //non-abstract method
    public void show(){
        System.out.println("This is not abstract methods");
    }

}
