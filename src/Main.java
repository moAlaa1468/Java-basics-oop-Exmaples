//================================== Using This keyword ========================
//        1. Referencing Instance Variables  this.name=name
//        2. Invoking Instance Methods    [using method above its creation]
//        3. Invoking Constructors        [overloaded constructors]
//        4. Returning the Current Class Instance   [method chaining ==> How to set all attributes in one line without constructor]
//        5. Passing Itself as an Argument in the Method Call  [Printer class]
//        6. Accessing the Current Class Instance  [inner and outer classes]

//         OuterClass outer=new OuterClass();
//         OuterClass.InnerClass   inner=outer.new InnerClass();
//         inner.printingNames();
//============================================================================
//The this keyword in Java is a reference to the current object.
//It is used for several purposes,
//primarily to eliminate confusion between class attributes and parameters,
//        and to make code more readable and maintainable.
//========================================================================







//    Attributes/Properties of Constructors in Java
//   1-No Return Type: Constructors do not have a return type,
//     not even void. They are not methods, so they don't return anything.
//
//   2-Same Name as Class: A constructor must have the same name as the class
//     in which it resides.
//
//   3-Automatic Invocation: Constructors are automatically called when an object
//     of the class is created.
//
//   4-Can Be Overloaded: You can have multiple constructors in a class
//     with different parameter lists (constructor overloading).
//
//   5-Cannot Be Inherited: Constructors are not inherited by subclasses,
//     but a subclass can call a superclass constructor using super().
//
//   6-Can Use Access Modifiers: Constructors can have access modifiers
//     (public, protected, private) to control the instantiation of objects.
//
//   6-No static, final, or abstract Modifiers: Constructors cannot be declared
//     as static, final, or abstract.
//
//   7-Can Call Other Constructors: Within a class, one constructor can call another
//     constructor using this().
//
//   8-Can Call Superclass Constructors: A constructor can call a constructor of
//     its superclass using super().
//
//   9-Initialize Object State: The primary purpose of a constructor
//     is to initialize the object's state (i.e., assign values to the object's fields).


//         1-Same Name as Class: The name of the constructor must be the same as the name of the class.
//        2-No Return Type: Constructors do not have a return type, not even void.
//        3-Called Automatically: A constructor is called automatically when an object is created.
//        4-Types of Constructors:
//           Default Constructor: A constructor with no parameters. If no constructor is defined,
//           Java provides a default constructor.[ For instance, integers will be initialized to 0,
//           floating points to 0.0, booleans to false, and object references to null.]
//           Parameterized Constructor: A constructor that takes arguments to initialize object attributes.
//        3-Constructor Overloading[constructor chaining]: Like other methods, constructors can be overloaded
//          by defining multiple constructors with different parameters
//        4-Usage in Inheritance: In inheritance, the super keyword can be used to call
//           the constructor of the parent class.


import abstraction.Circle;
import abstraction.Dog;
import abstraction.Recangle;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(22.3);
        Recangle recangle=new Recangle(22,44);

        System.out.println("The area of the circle is :");
        System.out.println(circle.calculateArea());

        circle.display();

        System.out.println(recangle.calculatePerimeter());;
       }
    }














//        // Attributes for a student
//        String name = "John Doe";
//        int id = 12345;
//        double grade = 85.5;
//
//        //
//        String StudentTwoname="mohamed";
//        int  StudentTwoId=555;
//        double studentTwograde=33;
//
//
//
//        // Display student details
//        displayStudentDetails(name, id, grade);
//        displayStudentDetails(StudentTwoname,StudentTwoId,studentTwograde);
//
//        // Update grade
//        grade = modifyGrade(grade, 90.0);
//
//        // Display updated student details
//        displayStudentDetails(name, id, grade);
//    }
//
//    // Function to display student details
//    public static void displayStudentDetails(String name, int id, double grade) {
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Grade: " + grade);
//    }
//    // Function to modify the grade
//    public static double modifyGrade(double oldGrade, double newGrade) {
//        return newGrade;
//    }

