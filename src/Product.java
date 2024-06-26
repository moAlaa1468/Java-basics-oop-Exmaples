public class Product {
   private double price;
   private double weight;
    private String name;

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  Product(){

   }
   public Product(double weight,double price){
      this.price=price;
      this.weight=weight;
   }

   //getters functions

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public  Product sum(Product x){
         this.weight=this.weight+x.weight;
         this.price=this.price+x.price;
         return this;
    }


    public void display(){
          System.out.println( "The price of this object is "+this.price);
          System.out.println("The weight of this object is "+this.weight);
     }
}
