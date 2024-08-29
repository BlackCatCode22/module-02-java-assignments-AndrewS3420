//aS 8/29/24
/*
* LoopsAndArrays.java
*
* this program will use the for loop to loop through
* a list of names stored
*
*
*
*
*
 */
import java.util.Scanner;


public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welcome to my friendly For loop Program\n");

        // Create a for loop that displays 'Hello there!' five times

        // the loop control variable of this for loop
        // is named i ( it means integer (whole number))
        // this loop control variable must be initialized, checked, and changed.
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        // Create a while loop that does the same thing.
        int loopControlVarible = 0;
        while (loopControlVarible < 10) {
            System.out.println("The value of i is: " + loopControlVarible);
            // Change the loop contol variable.
            loopControlVarible++;
        }

        // Create a String array pf five words.
        //String[] names = new String[10];
        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // Create an int array with 10 elements
        int[] myNumbers = new int[10];

        // Use a for loop to get ten whole number from the user.
        for (int i=0; i<10; i++){
            System.out.println("please enter numner " + (i+1) );
            myNumbers[i] = scanner.nextInt();
        }

        // Output the myNumbers[] array  ..... with a for loop. using the length property
        for (int i=0; i<10; i++){
            System.out.println("The value of myNumbers[" + i +"] is: " + myNumbers[i]);
        }

        System.out.println(" One of our names is: " + names[4]);
        // Output the length of our array named name.
        System.out.println("\n The length of our array 'names' is: " + names.length);

        // Create a for loop that outputs all element values in the name array.
        for (int i = 0; i < 5; i++) {
            System.out.println("names[" + i + "] is..." + names [i]);
        }


            System.out.println("\n This is the end of our program!\n");


        }
    }