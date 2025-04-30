import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class EvenNumberFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        // Use lambda with Streams to filter even numbers into a new list
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Lambda expression to keep even numbers
                .collect(Collectors.toList()); // Collect the result into a list
    }
}

class Main {
    public static void main(String[] args) {
        //Even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("Original List: " + numbers);

        System.out.println("Even numbers list: " + EvenNumberFilter.filterEvenNumbers(numbers));

        //Empty list

        List<Integer> emptyList = Collections.emptyList();
        System.out.println("\nOriginal List: " + emptyList);
        System.out.println("Even number list: " + EvenNumberFilter.filterEvenNumbers(emptyList));

        //Odd numbers

        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9,11,13,15,17,19,21);
        System.out.println("\nOriginal List: " + numbers2);

        System.out.println("Even numbers list: " + EvenNumberFilter.filterEvenNumbers(numbers2));


    }
}

