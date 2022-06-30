
package conditionalStatements;

import java.util.Scanner;

public class FirstTry {
    
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        
        num = input.nextInt();
        
        if (num >0){
            System.out.println("It is a positive number");
        }
        else if(num<0){
            System.out.println("It is a negetive number");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
