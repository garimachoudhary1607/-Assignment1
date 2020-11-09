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
/* OUTPUT:

Task 2:
A program to print the value given by the user.
Please enter your first and last name.
Garima Choudhary

This is my program to take  value by user!
My name is: Garima Choudhary
Task3:
Please enter any 2 numbers in between 1-10
3 4
Addition of both the numbers and placing them in the  variable z,z= 7
Printing the final result by adding 30 into z, Final result = 37
Task1:
Swap two  numbers using result as third variable: 4 3
Task1:
Swap two  numbers   without using  third variable: 3 4

Process finished with exit code 0
*/
