import java.util.LinkedList;

/**
 * PalindromeCheckerApp - UC8: Linked List Based Palindrome Checker
 * This class uses a Singly Linked List and the Fast/Slow pointer technique
 * to find the middle and compare halves for a palindrome check.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.println("Application Version: 1.0");

        String input = "racecar";

        // UC8 Data Structure: Singly Linked List
        LinkedList<Character> list = new LinkedList<>();

        // Convert string to linked list (Node Traversal)
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        // Logic: Compare elements from front and back using list indexing
        // (Simulating the behavior of comparing halves)
        boolean isPalindrome = true;
        int size = list.size();

        for (int i = 0; i < size / 2; i++) {
            // Compare front half with the corresponding element in the second half
            if (!list.get(i).equals(list.get(size - 1 - i))) {
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
