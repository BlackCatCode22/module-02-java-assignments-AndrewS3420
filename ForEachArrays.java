// AS 9/2/24
// ForEachArrays.java

public class ForEachArrays {
    public static void main(String[] args) {
        System.out.printf("\n Welcome to my For : Each practice program!\n");


        // Create an array of cars. Do this two different ways and be able to explain
        // your lab partner

        // Create a cars[] array using initialization
        String[] cars = {"BMW", "Tesla", "Honda"};

        // Output the cars array using a for each loop
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n My for loop is done.");

        // Use a For : each loop to do the same thing
        for (String car : cars)
            System.out.println(car);


        // myCars[0], myCars[1], myCars[2], myCar[3]

        // Create a String array creating the new operator.
        // Create a 4 element String array named myCars
        String[] myCars = new String[4];

        // Fill the newly created String[] array with data.
        myCars[0] = "tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to output the myCar[] array
        for (String myCar : myCars) {
            System.out.println("\n A car in myCar[] array is: " + myCar);
        }

        String[] myString = new String[60000];

        /*
        // Use a for loop to fill the array with some string
        for (int i = 0; i < 600; i++) {
            // Fill my array with strings
            myString[i] = " this is string number: " + (i + 1);
        }
        */

        int aNum = 0;
        for (String aStr : myString) {
            // fill my array with strings
            myString[aNum] = "this is string number: " + (aNum + 1);
            aNum++;
        }

        // Now..... use a for : each loop to output the myString[] array
        for (String aStr : myString) {
            System.out.println("An elment in myStrings[] is " + aStr);

        }
    }
}