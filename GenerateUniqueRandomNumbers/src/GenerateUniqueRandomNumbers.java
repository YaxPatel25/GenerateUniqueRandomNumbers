import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
 
public class GenerateUniqueRandomNumbers {
 
    /**
     * Generates a list of unique numbers from 1 to 10,000 in random order.
     * The list is shuffled each time the method is called, ensuring unique and random ordering.
     *
     * @return List<Integer> - A list containing 10,000 unique integers in random order
     */
    public static List<Integer> generateRandomList() {
        List<Integer> numbers = new ArrayList<>();
        // Populate the list with numbers from 1 to 10,000
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
 
        // Shuffle the list to generate random order of elements
        Collections.shuffle(numbers);
        return numbers;
    }
 
    public static void main(String[] args) {
        // Generate and print the list of unique random numbers
        List<Integer> randomNumbers = generateRandomList();
		// Print the complete random list
        System.out.println("Randomized List (Print all random 10000 elements): " + randomNumbers.subList(0, 10000));
    }
}