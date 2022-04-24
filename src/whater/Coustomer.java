/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whater;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mohme
 */
public class Coustomer {

    public Coustomer(String name, double cart) {
        this.name = name;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonay() {
        return cart;
    }

    public void setMonay(double monay) {
        this.cart = monay;
    }
    String name;
    double cart;
    HashMap<Integer,Flwoer> coustomerFlower=new HashMap();
    public void addItemToCart(int count,Flwoer flowerName){
       
        if(coustomerFlower.containsValue(flowerName)){
        coustomerFlower.put(count+1, flowerName);
         System.out.println("increase item to your cart");
        return;
        }
         coustomerFlower.put(count, flowerName);
          System.out.println("item is added to your cart");
    }
    public void printCartInforamtion(){
        System.out.println("wlecome "+name+" your cart info is :");
        System.out.println("cart monye is $("+cart+")");
        if(coustomerFlower.isEmpty()){
            System.out.println("<<< your pay noting >>>");
            System.out.println("zero item");
        }else{
            System.out.println("<<< your pay >>>");
            for (var flower : coustomerFlower.entrySet()) {
                     System.out.println("your pay "+flower.getKey()+" items from "+flower.getValue().getName()+ "flower");
            }
          
        }
  
    }
    
    
}
