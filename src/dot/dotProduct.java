package dot;

import java.io.Console;
import java.util.Arrays;

public class dotProduct {
    
    public static void main(String args[]) {
        
        // Get the console
        Console cons = System.console();

        // Get the matrix string equ and terms as int
        int equations = Integer.parseInt(cons.readLine("How many equations: "));
        int terms = Integer.parseInt(cons.readLine("How many terms:"));
        
        // Create matrix
        int[][] matrix = new int[equations][terms];
        
        // Input equations into matrix

        String inputTerms; // Declare outside to minimise declaration in the for loop
        String[] termsStr;

        System.out.println("Please enter the equation(s)");
        for (int i=0; i<equations; i++) {
            // Get equation from user
            inputTerms = cons.readLine("%d)", i+1);
            // Split terms into an array
            termsStr = inputTerms.trim().split(" ");
            // Input terms into matrix
            for (int j=0; j<terms; j++) {
                matrix[i][j] = Integer.parseInt(termsStr[j]);
            }
        }
        
        // Get coefficients from user.
        String inputWeights = cons.readLine("Please enter the weights: ");
        // Split to store coeff in array
        String[] weightsStr = inputWeights.trim().split(" ");
        int[] weights = new int[terms];
        for (int i=0; i<terms; i++) {
            weights[i] = Integer.parseInt(weightsStr[i]);
        }

        // Multiply matrix equ with weights and store in array products
        int[] products = new int[equations];
        int dotProduct;
        for (int i=0; i<equations; i++) {
            dotProduct = 0;
            for (int j=0; j<terms; j++) {
                dotProduct += (matrix[i][j] * weights[j]);
            }
            products[i] = dotProduct;
        }

        System.out.println("Dot product:");
        System.out.println(Arrays.toString(products));
    }   
}
