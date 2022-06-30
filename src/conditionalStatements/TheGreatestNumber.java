
package conditionalStatements;

import java.util.Scanner;

public class TheGreatestNumber {
    
    public static void main(String[] args) {
        
        int firstNum;
        int secondNum;
        int thirdNum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the 1st Number: ");
        firstNum = input.nextInt();
        
        System.out.print("Input the 2nd Number: ");
        secondNum = input.nextInt();
        
        System.out.print("Input the 3rd Number: ");
        thirdNum = input.nextInt();
        
        /*if(firstNum>secondNum && firstNum>thirdNum){
            System.out.println("The greatest Number: " + firstNum);
        }
        else if(secondNum > firstNum && secondNum > thirdNum){
            System.out.println("The greatest Number: " + secondNum);
        }
        else if(thirdNum > firstNum && thirdNum >secondNum ){
            System.out.println("The greatest Number: " + thirdNum);
        }
        else{
            System.out.println("The greatest Number: "+ thirdNum);
        }*/
        
            if(firstNum>secondNum)
            if(firstNum>secondNum)
              System.out.println("The greatest Number: " + firstNum);
                
            if(secondNum>firstNum)
            if(secondNum>thirdNum)
              System.out.println("The greatest Number: " + secondNum);
                
            if(thirdNum>firstNum)
            if(thirdNum>secondNum)
              System.out.println("The greatest Number: " + thirdNum);
      
        
    }
}
