// NAME: GARIMA

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Task 2
        String first, last;
        int a,b,z,c,result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 2:\nA program to print the value given by the user.");
        System.out.println("Please enter your first and last name.");

        first = sc.next();
        last = sc.next();

        // output
        System.out.println("\nThis is my program to take  value by user!");
        System.out.println("My name is: " + first + " " + last);

        //Task3

        System.out.println("Task3:\nPlease enter any 2 numbers in between 1-10");

        a = sc.nextInt();
        b = sc.nextInt();
        z = a+b;
        c = z+30;

        System.out.println("Addition of both the numbers and placing them in the  variable z,z= " + z);
        System.out.println("Printing the final result by adding 30 into z, Final result = " + c );

        // Task1

        result = a;
        a = b;
        b = result;
        System.out.println("Task1:\nSwap two  numbers using result as third variable: "+ a + " " + b);

        // TASK 1 Swap numbers without using third variable

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Task1:\nSwap two  numbers   without using  third variable: "+ a + " " + b);

    }
}
