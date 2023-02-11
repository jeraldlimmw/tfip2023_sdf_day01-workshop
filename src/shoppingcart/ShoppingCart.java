package shoppingcart;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static List<String> cart;
    public static void main (String[] args) {
        
        System.out.println("Welcome to your shopping cart");

        Console cons = System.console(); // to get input from user
        cart = new ArrayList<>(); // to store, add and remove items

        while (true) {
            // require input from user so long as program is running
            String s = cons.readLine("> ");
            
            // pre: input must not be empty
            if (s.isEmpty()) {
                System.err.println("user input required");
                continue; // does not exit the while loop
            }

            // post: carry out list/add/delete function depending on first word of input (input[0])
            String[] input = s.trim().toLowerCase().split("[ ,]+"); // split - remove all commas and spaces
            
            switch(input[0]) {
                case "list":
                    list();
                    break;
                case "add":
                    for (int i = 1; i < input.length; i++) {
                        add(input[i]);
                    }
                    break;
                case "delete":
                    delete(input[1]);
                    break;
                default:
                    System.out.println("Invalid input. Try again"); // if first word is not list/add/delete
                    break;

            /* alternative code using if-else loops

            if (input[0].equals("list")) {
                list();
            }
            if (input[0].equals("add")) {
                for (int i = 1; i < input.length; i++) {
                    add(input[i]);
                }
            }
            if (input[0].equals("delete")) {
                delete(input[1]);
            } else {
                System.out.println("Invalid input. Try again");
            }*/
            }
        }
    }

    // pre: cart must have items; else tell user cart is empty
    // post: print number starting from 1 and item
    public static void list() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.printf("%d. %s\n", i+1, cart.get(i));
            }
        }
    }
    
    // pre: item must not already be in cart; else tell user item already in cart
    // post add item to cart
    public static void add(String item){
        if (cart.contains(item)) {
            System.out.printf("You have %s in your cart\n", item);
        } else {
            cart.add(item);
            System.out.println(item + " added to cart");
        }
    }

    // pre: item index must not exceed cart size; else tell user incorrect item index
    // post: remove item from cart
    public static void delete(String itemNo) {
        int itemInteger = Integer.parseInt(itemNo);
        if (itemInteger > cart.size()) {
            System.out.println("Incorrect item index");
        } else {
            String r = cart.remove(itemInteger-1);
            System.out.println(r + " removed from cart");
        }
    }
}