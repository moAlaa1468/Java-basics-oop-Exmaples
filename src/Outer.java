public class Outer {
    private String name="OuterClassName";

    public class Inner{
        private String name="InnerClassName";

        public void printName(){
            System.out.println("The value of the outer class name is : "+Outer.this.name);
            System.out.println("The value of the inner class name is : "+this.name);

        }
    }
}
