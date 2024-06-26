package abstraction;

public class Cat extends Animal{
    protected void eat(){
        System.out.println("Eat in the Cat Class");
    }

    @Override
    public void display(){
        System.out.println("This is the cat class");
    }
}
