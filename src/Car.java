public class Car {
private String name;
private String color;
private String model;
private int age;
public int length;


public Car(String name, String color, String model,int age) {
    this.name = name;
    this.color = color;
    this.model = model;
    this.age=age;
}
//==================================================
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public void setModel(String model) {
    if(model ==""){
        System.out.println("please enter invalid model");
    }else{
        this.model = model;
    }
}

public void setName(String name){
    if(name==""){
      System.out.println("please enter invalid name");
    }else{
        this.name=name;
    }
}

    public void setColor(String color) {
        this.color = color;
    }


    ///===========================================================
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public String getName() {
        return name;
    }
    public int getLength(){
    return length;
}
    //===============================================
}
