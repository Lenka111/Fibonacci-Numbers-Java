//Elena Voinu

//Fibonacci Series using Recursion

import java.util.Scanner;

public class FibonacciSequence {

     public static int fibNum(int num){
          //base case
       if (num < 0)
           System.out.println("Enter a positive number");

       else if (num == 0 || num == 1)
           return num;

       else
            //reccursively compute Fibbonacci number
           return (fibNum(num-1) + fibNum(num-2));

       return num;


    } // end method fibNum

    public static void main (String [] args){
         Scanner sc =  new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number = sc.nextInt();
         System.out.println("Fib ("+ number+ ") = "+ fibNum(number));
    } // end main

}// end class
