package class24;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        // Create a list of even numbers from 1 to 500
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);
        }

        // Use Java Streams to filter and collect even numbers not divisible by 5
        List<Integer> filteredEvenNumbers = evenNumbers.stream()
                .filter(number -> number % 5 != 0)
                .collect(Collectors.toList());

        // Print the filtered even numbers
        filteredEvenNumbers.forEach(System.out::println);
    }
}





