
package conditionalStatements;

import java.util.Scanner;

public class QuadraticEquation {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
        System.out.print("Input a: ");
        double a = input.nextDouble();
        
        System.out.print("Input b: ");
        double b = input.nextDouble();
        
        System.out.print("Input c: ");
        double c = input.nextDouble();
        
        double result = b*b - 4*a*c;
        
        
            
            double root1 = (-b + Math.sqrt(result))/(2*a);
            System.out.printf("Root1: %.4f\n" , root1);
            
            double root2 = (-b - Math.sqrt(result))/(2*a);
            System.out.printf("Root2: %.4f" , root2);
        
    }
    
    
}
