# SortedList Program

A Java application that reads integer numbers from the console, stores them in a linked list, sorts them in ascending order, and outputs the sorted list.

---

## Overview

The **SortedList** program demonstrates basic Java functionalities including:
- **Input Processing:** Reads user input using `Scanner`. Each input is trimmed and parsed as an integer.
- **Data Storage:** Utilizes a `LinkedList<Integer>` for dynamic storage of the numbers.
- **Sorting:** Leverages `Collections.sort()` from the Java Standard Library to sort the list.
- **Output:** Displays the sorted list on the console.

---

## Features

- **Dynamic Input Handling:** Continuously reads input until the user types `"done"` (case-insensitive).
- **Robust Error Handling:** Catches non-integer inputs and informs the user without terminating the program.
- **Efficient Data Structures:** Uses `LinkedList` for flexible, dynamic data storage.
- **Standard API Reuse:** Employs Java's built-in libraries for input, data manipulation, and sorting.

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

- **Version:** 1.0  
- **Date:** 2025-02-06

---

