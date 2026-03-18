/**
 * PalindromeCheckerApp - UC4: Character Array Based Palindrome Check
 * This class uses the two-pointer technique on a character array for efficiency.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "radar";

        // UC4: Convert string to char[] (Character Array)
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;

        // Two-Pointer Technique
        // left pointer starts at index 0, right pointer starts at the last index
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Compare start & end characters
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop if a mismatch is found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        // Display result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
