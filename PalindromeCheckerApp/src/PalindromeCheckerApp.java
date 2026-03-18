/**
 * PalindromeCheckerApp - UC2: Print a Hardcoded Palindrome Result
 * This class validates if a hardcoded string is a palindrome.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        // UC2: Hardcoded String check
        String original = "madam";
        String reversed = "";

        // Logic to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Conditional statement to check if palindrome
        if (original.equals(reversed)) {
            System.out.println("The word '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a Palindrome.");
        }
    }
}
