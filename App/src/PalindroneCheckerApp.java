import java.util.Stack;

/*
 * ===============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ===============================================================
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * Application Flow:
 * 1. Push characters into a stack
 * 2. Pop them in reverse order
 * 3. Compare with original sequence
 * 4. Display the result
 * ===============================================================
 */

public class PalindroneCheckerApp {

    /*
     * Application entry point for UC5
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {

            // Pop character from stack
            char popped = stack.pop();

            // Compare characters
            if (c != popped) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
