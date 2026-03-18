import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * PalindromeCheckerApp - UC6: Queue + Stack Based Palindrome Check
 * This class compares FIFO (Queue) and LIFO (Stack) behaviors to validate a palindrome.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "radar";

        // UC6 Data Structures: Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue: First In First Out
            stack.push(ch);  // Push: Last In First Out
        }

        boolean isPalindrome = true;

        // Logical Comparison: Compare dequeue vs pop
        // Dequeue gives characters in original order; Pop gives them in reverse
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
