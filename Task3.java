package class24;
//Create an arrayList of even numbers from 1 to 500 using
// a loop. Then write another loop to  Remove
// any number that is divisible by 5 from that arrayList.

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Add even numbers from 1 to 500 to the ArrayList
        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);
        }

        // Remove numbers divisible by 5
        ArrayList<Integer> numbersToRemove = new ArrayList<>();
        for (Integer number : evenNumbers) {
            if (number % 5 == 0) {
                numbersToRemove.add(number);
            }
        }

        evenNumbers.removeAll(numbersToRemove);

        // Print the modified ArrayList
        System.out.print(evenNumbers);
    }
}






