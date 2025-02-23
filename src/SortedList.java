//import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * The SortedList program reads integer numbers from standard input, stores them in a Stack ( previously used LinkedList ),
 * sorts the numbers in ascending order, and outputs the sorted values to the console.
 * <p>
 * <strong>Design Overview:</strong>
 * <ul>
 *   <li><strong>Input Processing:</strong> Uses a {@code Scanner} to read lines from standard input.
 *       Each input line is trimmed and then attempted to be parsed as an integer. Non-integer inputs
 *       are caught and reported using exception handling.</li>
 *   <li><strong>Data Storage:</strong> Utilizes a {@code Stack<Integer>} to store integers.
 *       <em>Maintenance Update:</em> This replaces the previous implementation which used a {@code LinkedList<Integer>}.
 *   </li>
 *   <li><strong>Sorting:</strong> Leverages the {@code Collections.sort()} method, a standard API,
 *       to sort any list in ascending order.</li>
 *   <li><strong>Output:</strong> The sorted list is printed to the console.</li>
 * </ul>
 * <p>
 * <strong>Code Reuse Examples:</strong>
 * <ul>
 *   <li>The <code>java.util.Scanner</code> class is reused for input handling, eliminating the need
 *       to write custom input routines.</li>
 *   <li><em>java.util.Stack:</em> For data storage, the built-in {@code Stack} class is used.
 *       This avoids reinventing a stack data structure by relying on a well-tested, standard API.</li>
 *   <li>The <code>Collections.sort()</code> method from the <code>java.util.Collections</code> class is
 *       employed to sort the Stack(that implements the List), reusing a well-tested sorting algorithm.</li>
 *   <li>Error handling is implemented using the built-in exception handling (try-catch) mechanism,
 *       reusing Java's standard error reporting functionality.</li>
 * </ul>
 * <p>
 * <strong>Maintenance Update Details:</strong>
 * <ul>
 *   <li>The original SortedList used a LinkedList to store integers. In this update, the data storage has been changed to a Stack.
 *       This change was made to better reflect a last-in-first-out (LIFO) data structure where needed,
 *       while still reusing the core logic of input, sorting, and output.
 *   </li>
 *   <li>The input, sorting, and error handling logic remain the same as in the previous version, demonstrating effective code reuse.</li>
 * </ul>
 * <p>
 * <strong>Usage:</strong>
 * <pre>{@code
 *   java SortedList
 * }</pre>
 * <p>
 * The user is prompted to enter integers one per line. When finished, type "done" (case-insensitive)
 * to terminate input. If a non-integer value is entered, the program displays an error message and
 * continues processing subsequent input.
 *
 * @version 1.1 (Maintenance Update)
 * @since 2025-02-06
 * @author Daniel Vedamuthu
 *
 */
public class SortedList {

    /**
     * The main method reads integer values from the console, validates the input,
     * stores valid integers in a Stack, sorts the list in ascending order, and prints
     * the sorted list.
     * <p>
     * <strong>Flow Overview:</strong>
     * <ol>
     *   <li>Initialize a {@code Scanner} to read user input from the console.</li>
     *   <li>Prompt the user to enter integer numbers or type "done" to finish.</li>
     *   <li>For each line of input:
     *     <ul>
     *       <li>If the input is "done" (ignoring case), exit the loop.</li>
     *       <li>Attempt to parse the input as an integer using {@code Integer.parseInt()}.</li>
     *       <li>If parsing fails, catch the {@code NumberFormatException} and display an error message.</li>
     *       <li>If successful, push the integer to the {@code Stack}.</li>
     *     </ul>
     *   </li>
     *   <li>After all input has been processed, close the {@code Scanner}.</li>
     *   <li>Sort the {@code Stack} using {@code Collections.sort()} (code reuse: standard API).</li>
     *   <li>Print the sorted list to the console.</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Stack to store valid integers.
        Stack<Integer> numbers = new Stack<>();

        // Initialize Scanner for reading console input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers or finish input.
        System.out.println("Enter integer numbers (or type 'done' to finish):");

        // Process input until the termination keyword "done" is entered.
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break; // Exit loop if input is "done"
            }
            try {
                // Attempt to parse the input as an integer.
                int number = Integer.parseInt(input);
                // Reusing stack.push() for adding elements.
                numbers.push(number);
            } catch (NumberFormatException e) {
                // Inform the user about invalid input without reinventing error reporting.
                System.out.println("Invalid input encountered: \"" + input +
                        "\" is not a valid integer. Please try again.");
            }
        }

        // Close the scanner to release system resources.
        scanner.close();

        // Use Collections.sort() to sort the Stack (code reuse: standard Java API).
        Collections.sort(numbers);

        // Output the sorted list to the console.
        System.out.println("Sorted List:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}