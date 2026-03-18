import java.util.Stack;

/**
 * PalindromeCheckerApp - UC5: Stack-Based Palindrome Checker
 * This class uses the LIFO (Last In First Out) property of a Stack
 * to reverse a string and validate if it's a palindrome.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "madam";

        // UC5: Data Structure: Stack
        Stack<Character> stack = new Stack<>();

        // Push Operation: Insert characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Reversal Logic: Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            // Pop Operation: Removes elements in reverse order
            reversed += stack.pop();
        }

        // Compare and Print Result
        System.out.println("Input: " + input);
        System.out.println("Reversed via Stack: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
