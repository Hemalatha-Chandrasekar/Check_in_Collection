import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Step 2: Add at least five names to the list
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.add("Eve");
        students.add("Charlie");

        // Step 3: Print the list of names
        System.out.println("Student names: " + students);

        // Step 4: Remove a name (for example, "Bob") and print the updated list
        students.remove("Bob");
        System.out.println("Updated student names: " + students);

        // Step 5: Sort the list alphabetically and print the sorted list
        Collections.sort(students);
        System.out.println("Sorted student names: " + students);
    }
}
