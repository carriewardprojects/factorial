/*
 * Program name: Factorial.java
 * A simple JAVA program that computes the factorial of a number.
 * @author Carrie Ward 08/14/2017
 */

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        int num;
        int factorial = 1;
        
        // request an integer value from the user
        System.out.print("Type an integer value and press ENTER: ");
        // store the user value
        num = in.nextInt();
        
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        
        // display the results 
        System.out.println("\nThe factorial of " + num + " is " + factorial + "\n");
    }
}
