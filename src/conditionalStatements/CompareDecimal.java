
package conditionalStatements;

import java.util.Scanner;

public class CompareDecimal {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter floating-point number: ");
        double x = input.nextDouble();
        
        System.out.print("Enter another floating-point number: ");
        double y = input.nextDouble();
        //x = Math.round(x* 1000);
        //x = x/1000;
        //System.out.println("Number is: " + x);
        
        if(x==y){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are different");
        }
    }
}
