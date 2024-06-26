public class Student {
    private static String name="Mohamed alaa amer";
  public static int realCounter=0;

      public Student(){
          countingObjectsFromTheClass();
      }
      public Student(String name){
          countingObjectsFromTheClass();
          this.name=name;
      }

      public int countingObjectsFromTheClass(){
          return realCounter++;
      }

      public static void display(){
          System.out.println(name);
      }


}