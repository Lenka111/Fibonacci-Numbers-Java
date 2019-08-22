//Elena Voinu

//Fibonacci Series using Recursion

import java.util.Scanner;

public class FibonacciSequence {

     static int fibNum(int i){
       if (i < 0)
           System.out.println("Enter a positive number");

       else if (i == 0 || i == 1)
           return i;

       else
           return (fibNum(i-1) + fibNum(i-2));

       return i;


    } // end method fibNum

    public static void main (String [] args){
         Scanner sc =  new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number = sc.nextInt();
         System.out.println("Fib ("+ number+ ") = "+ fibNum(number));
    } // end main

}// end class
