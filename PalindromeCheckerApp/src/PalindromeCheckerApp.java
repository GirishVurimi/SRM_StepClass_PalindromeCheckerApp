import java.util.ArrayDeque;
import java.util.Deque;

/**
 * PalindromeCheckerApp - UC7: Deque-Based Optimized Palindrome Checker
 * This class uses a Deque to compare front and rear elements efficiently.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "deified";

        // UC7 Data Structure: Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        // Remove first & last characters and compare until empty or one element remains
        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
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
