package assignment_1;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill the array with different random numbers from 1 to 50
        for (int i = 0; i < array.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(50) + 1;
            } while (contains(array, randomNumber)); // Ensure the number is not already in the array
            array[i] = randomNumber;
        }

        // Display the values in the array
        System.out.println("Array:");
        displayArray(array);

        // Prompt the user for an integer
        System.out.print("Value to find: ");
        int target = scanner.nextInt();

        // Search through the array to find the slots where the value is located
        boolean found = false;
        int lastSlot = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                lastSlot = i;
                System.out.println(target + " is in slot " + i + ".");
            }
        }

        // Display a message if the value is not found
        if (!found) {
            System.out.println(target + " is not in the array.");
        } else if (lastSlot != -1) {
            System.out.println("Last appearance of " + target + " is in slot " + lastSlot + ".");
        }
    }

    // Helper method to check if a number is already present in the array
    private static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    // Helper method to display the values in the array
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
