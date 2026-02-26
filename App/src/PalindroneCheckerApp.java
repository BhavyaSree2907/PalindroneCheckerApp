/**
 * ================================================================
 * MAIN CLASS - PalindroneCheckerApp
 * ================================================================
 *
 * Use Case 2: Palindrone Checking Functionality
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * The application:
 * - Displays a welcome message
 * - Accepts user input
 * - Checks whether the input is a palindrome
 * - Displays the result
 *
 * @author bhavyasree
 * @version 2.0
 */

import java.util.Scanner;

public class PalindroneCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" Welcome to Palindroe Checker App ");
        System.out.println(" Version: 2.0");
        System.out.println("===============================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("Result: It is a Palindrome!");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();

        System.out.println("===============================================");
        System.out.println(" Application Closed ");
        System.out.println("===============================================");
    }
}