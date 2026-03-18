/**
 * PalindromeCheckerApp - UC3: Palindrome Check Using String Reverse
 * This class demonstrates string reversal using a loop and string concatenation.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Welcome Message (UC1)
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        // Hardcoded input string
        String original = "madam";
        String reversed = "";

        // UC3: Loop (for loop) to reverse the string
        // We start from the last index (length - 1) and move to the first (0)
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) - creates a new string object each time due to immutability
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals() method
        if (original.equals(reversed)) {
            System.out.println("Input: " + original);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Input: " + original);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
