public class Calc {
    public  int number1;
    public  int number2;
    public static int counter=0;

   public  Calc(){
        counting();
    }
    public Calc(int number1,int number2){
       this.number1=number1;
       this.number2=number2;
    }

    public static int add(int x, int y){
       return  x+y;
    }

    public static int subtraction (int x, int y){
       return x-y;
    }
    public static int division (int x, int y){
        return x/y;
    }

    public static int mutliply (int x, int y){
        return x*y;
    }

    public int counting(){
       return counter++;
    }
}
