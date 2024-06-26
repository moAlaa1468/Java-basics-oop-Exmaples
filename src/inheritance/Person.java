package inheritance;

public class Person {
    public String name;
    public String address;
    public double age;
    public String nationality;

    public Person(){
        System.out.println("The super class constructor is invoked !");
    } //is being called once you inherit this class

    public Person(String name, String nationality, double age, String address) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public double getAge() {
        return age;
    }

}
