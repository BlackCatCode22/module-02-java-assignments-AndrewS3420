// AS 9/5/24
// MaddnessWithMethdos.java

import  java.util.Scanner;


public class MaddnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\n Hello and Welcome to Maddnes with Methods");

        int userInputNumber = 0;

        userInputNumber = getUserInput();

        System.out.println("\n the user input the number: " + userInputNumber);

        //Find the largest of the two ints
        int myFirstNum = 8;
        int myScoundNum = 4;
        int largest = 0;
        // call the method name compareTwoInts()
        largest = compareTwoInts(myFirstNum, myScoundNum);
        System.out.println("\n the largest of " + myFirstNum + " and " + myScoundNum + " is: " + largest);

        // Sum two ints!
        int theSumOfTwoInts = 0;
        //theSumOfTwoInts = sumTwoInts(myFirstNum, myScoundNum);
        theSumOfTwoInts = sumTwoInts(4, 5);
        System.out.println("\n the sum of " + myFirstNum + " and " + myScoundNum + " is: " + theSumOfTwoInts);


    }


    // method to get an integar from the user
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        // Read the integar input from the user
        int userInput = scanner.nextInt();
        userInput = scanner.nextInt();
        return userInput; // Return the input to the calling method

    }

    // Method to compare two integers and return integers
    public static int compareTwoInts(int firstInt, int secondInt) {
        int largest = 0;
        if (firstInt > secondInt) {
            largest = firstInt;
        } else {
            largest = secondInt;
        }

        return largest;

    }


    //method to return the sum of two integers
    public static int sumTwoInts(int num1, int num2) {
        int theSum = 0;
        theSum = num1 + num2;
        return theSum;
    }
}


