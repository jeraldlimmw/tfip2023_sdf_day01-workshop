package myapp;

import java.io.Console;

public class shoppingCart {

    public static void main(String args[]){
        
        Console cons = System.console()
        public String[] cart = new String[0];

        System.out.printf("Welcome to your shopping cart");
        String input = cons.readLine("> ");

        if (input.contains("list")) {
            
        }  
        if (input.contains("add")) {

        } 
        if (input.contains("delete")) {

        }

        public String[] list() {
            if (cart.length == 0) {
                System.out.printf("Your cart is empty\n");
            } else {
                for (int i = 0; i < cart.length; i++) {
                    System.out.print("%d. ", i + 1);
                    System.out.println(cart[i]);
                }
            }
        }

        public String add(String items) {
            
        }

        public String remove (int index) {
            cart[index-1]
        }

    }


}
