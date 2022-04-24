
package whater;


public class Flwoer {
   private final String name ;
   private double price;
   private String color;
   private int contity;
     
    public Flwoer(String name ,double price , String color,int contity){
    this.name=name;
    this.price=price;
    this.color=color;
    this.contity=contity;
    }
    
    public String getName() {
        return name;
    }
    public int getContity() {
        return contity;
    }
    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    public void setContity(int newValue){
    contity-=newValue;
        System.out.println("contitiy is update --");
    }
    
   @Override
    public String toString(){
     return "{الاسم->"+name+"||السعر->$"+price+"|| العدد->"+contity+"||اللون-> "+color+"}";
        
        
    }
    
}
