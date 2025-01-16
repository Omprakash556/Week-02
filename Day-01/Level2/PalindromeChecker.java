package Level2;
public class PalindromeChecker {
    // Attribute to store the text
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversedText = "";
        // Loop to reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }

        // Check if the original text is the same as the reversed text
        return text.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Create an object of PalindromeChecker with a test string
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult(); // Display the result for "madam"

        // Create another object with a non-palindrome string
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult(); // Display the result for "hello"
    }
}
