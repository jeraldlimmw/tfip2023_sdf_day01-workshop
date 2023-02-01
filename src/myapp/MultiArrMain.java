package myapp;

public class MultiArrMain {

    public static void main(String args[]) {
        
        // create 2D array
        // array of array of String e.g. ((String)[])[]
        String [][] names = new String [2][3]; // Outer array of two elements. Each has three arrays elements.
        names[0][0] = "a";
        names[0][1] = "b";
        names[0][2] = "c";
        names[1][0] = "d";
        names[1][1] = "e";
        names[1][2] = "f";

        int i = 0;
        while (i < names.length) {
            int j = 0;
            while (j < names[i].length) {
                System.out.printf(">>[%d][%d] %s\n", i, j, names[i][j]);
                j++;
            }
            i++;
        }
    }
    
}
