package myapp;

import java.io.Console;
import java.util.Arrays;

public class dotProduct {
    
    public static void main(String args[]) {
        Console cons = System.console();

        String matrixEquations = cons.readLine("How many equations: ");
        String matrixTerms = cons.readLine("How many terms:");

        int equations = Integer.parseInt(matrixEquations);
        int terms = Integer.parseInt(matrixTerms);

        int[][] matrix = new int[equations][terms];

        System.out.println("Please enter the equation");
        for (int i=0; i<equations; i++) {
            String inputTerms = cons.readLine("%d)", i+1);
            String[] termsStr = inputTerms.trim().split(" ");
            for (int j=0; j<terms; j++) {
                matrix[i][j] = Integer.parseInt(termsStr[j]);
            }
        }
        
        String inputWeights = cons.readLine("Please enter the weights: ");
        
        String[] weightsStr = inputWeights.trim().split(" ");
        int[] weights = new int[terms];

        for (int i=0; i<terms; i++) {
            weights[i] = Integer.parseInt(weightsStr[i]);
        }

        int[] products = new int[equations];
        for (int i=0; i<equations; i++) {
            int product = 0;
            for (int j=0; j<terms; j++) {
                product += (matrix[i][j] * weights[j]);
            }
            products[i] = product;
        }

        System.out.println(Arrays.toString(products));
    }   
}
