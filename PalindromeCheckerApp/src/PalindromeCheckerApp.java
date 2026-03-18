/**
 * PalindromeCheckerApp - UC9: Recursive Palindrome Checker
 * This class uses recursion and the call stack to validate a palindrome.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "level";

        // UC9: Recursive call
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Display result
        System.out.println("Input: " + input);
        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }

    /**
     * Recursive method to check palindrome logic.
     * Uses the Call Stack to manage subproblems.
     */
    public static boolean isPalindrome(String str, int start, int end) {
        // UC9: Base Condition - If pointers meet or cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Compare start & end characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Solve for the inner substring
        return isPalindrome(str, start + 1, end - 1);
    }
}
