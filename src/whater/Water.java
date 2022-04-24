package whater;

import java.util.ArrayList;
import java.util.Scanner;

public class Water {

    public static ArrayList<Flwoer> myFlower;
    public static Scanner in;
    public static int choise;
    public static Coustomer coustomer;

    public static void displayAllFlower() {
        int itemIndex = 1;
             System.out.println("to select item press to number your flower ");
             for (var f : myFlower) {
       
            System.out.println(itemIndex++ + ")" + f);

        }
        System.out.print("select item>>");
        choise = in.nextInt();
        System.out.println("");
        Flwoer f = myFlower.get(choise - 1);
        int maxflowerInStore = f.getContity();
        System.out.print("we have only " + maxflowerInStore + " item, how meny item your need >>");

        int itemCount = in.nextInt();
        if (itemCount > maxflowerInStore) {
            System.out.println("your not in limet please intake number to make transction");
            System.out.println("sory well get you back to main stor");
            return;
        } else {
            //todo check card money is enghf or not
            
            coustomer.addItemToCart(itemCount, f);
        }
        f.setContity(itemCount);
        myFlower.set(choise - 1, f);
    }

    public static void main(String[] args) {
        boolean flage = true;
    
        in = new Scanner(System.in);
        myFlower = new ArrayList();

        myFlower.add(new Flwoer("زهرة الزنبق", 25, "أسود", 25));
        myFlower.add(new Flwoer("زهرة النرجس", 5, "أبيض", 5));
        myFlower.add(new Flwoer("زهرة عصفور الجنة", 10, "أصفر", 3));
        myFlower.add(new Flwoer("زهرة الديزي", 8.5, "أحمر", 1));
        myFlower.add(new Flwoer("زهرة زنبق الياقوت", 15.5, "أبيض", 7));
        myFlower.add(new Flwoer("زهرة العنبر", 3.75, "وردي", 20));
        myFlower.add(new Flwoer("زهرة عادي", 3.75, "أحمر", 50));
        System.out.println("please inter your name :>");
        String name = in.nextLine();
        System.out.println("please inter your cart money");
        double cart = in.nextDouble();
        coustomer = new Coustomer(name, cart);
        do {
            System.out.println("|----------------------------|");
            System.out.println("|your welcome in our store:|");
            System.out.println("|----------------------------|");
            System.out.println("");
            System.out.println("1) display All flowers");
            System.out.println("2) display red flowers");
            System.out.println("3) display white flowers");
            System.out.println("4) display black flowers");
            System.out.println("5) display yellow flowers");

            System.out.println("6) exit");
            System.out.println("");
            System.out.println("> Enter your choise:");
            choise = in.nextInt();
            switch (choise) {
                case 1:
                    displayAllFlower();
                    break;
                case 2: coustomer.printCartInforamtion();break;
                case 6:
                    flage = false;
                default:
                    System.out.println("bye bye :)");

            }
        } while (flage);

    }
}
