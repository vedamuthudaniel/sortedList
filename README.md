# SortedList Program

A Java application that reads integer numbers from the console, stores them in a Stack(updated from LinkedList), sorts them in ascending order and outputs the sorted list.

---

## Overview

The **SortedList** program has a maintenance update of the previous version. This update replaces the **LinkedList** with a **Stack** while maintaining the same core functionality:
- **Input Processing:** Reads user input using `Scanner`. Each input is trimmed and parsed as an integer.
- **Data Storage:** Uses a `Stack<Integer>` instead of a `LinkedList<Integer>` from the previous version.
- **Sorting:** Utilizes `Collections.sort()` to sort the stack in ascending order.
- **Output:** Displays the sorted list on the console.

---

## Features

- **Maintenance Update:** Replaces `LinkedList` with `Stack` to reflect a last-in-first-out (LIFO) data structure.
- **Dynamic Input Handling:** Continuously reads input until the user types `"done"` (case-insensitive).
- **Robust Error Handling:** Catches non-integer inputs and informs the user without terminating the program.
- **Efficient Data Structures:** Uses `Stack` for flexible, dynamic data storage.
- **Standard API Reuse:** Employs Java's built-in libraries for input, data manipulation, and sorting.

---

## Maintenance Update Details

- The original **SortedList** stored integers using a `LinkedList<Integer>`. This update modifies the implementation to use a `Stack<Integer>`.
- This change introduces a LIFO structure where needed while keeping the core logic (input, sorting, and output) unchanged.
- The input processing, sorting, and error handling remain the same, demonstrating effective **code reuse**.

---

## Getting Started

### Prerequisites

- **Java Development Kit (JDK):** Ensure that Java 8 or higher is installed on your machine.

### Compilation

To compile the program, navigate to the directory containing the `SortedList.java` file and run:

```bash
javac SortedList.java
```

### Running the Program

After compiling, execute the program with:

```bash
java SortedList
```

---

## Usage Example

When you run the program, you will be prompted to enter integer numbers:

```
Enter integer numbers (or type 'done' to finish):
```

**Sample Interaction:**

```
Enter integer numbers (or type 'done' to finish):
10
5
hello
Invalid input encountered: "hello" is not a valid integer. Please try again.
15
done
Sorted List:
5
10
15
```

- **Input:** Enter integers one at a time.
- **Termination:** Type `"done"` (case-insensitive) when finished.
- **Output:** The program sorts the valid integers and prints the sorted list.

---

## Contributing

Contributions are welcome! If you have suggestions or improvements:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and open a pull request.

---

## Author

**Daniel Vedamuthu**

- **Version:** 1.1 (Maintenance Update)
- **Date:** 2025-02-06

---

