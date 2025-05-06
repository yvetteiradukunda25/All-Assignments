import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVStreamProcessor {
    public static double calculateAverageAge(String csvFilePath) throws IOException {

        try (Stream<String> Lines = Files.lines(Paths.get(csvFilePath))) {
            return Lines
                    .skip(1)
                    .filter(Age -> Age != null)
                    .map(line -> line.split(","))
                    .mapToInt(fields -> Integer.parseInt(fields[1]))
                    .average().orElse(0.0);
        }
        catch (NumberFormatException e)

        {
            System.out.println("The CSV file contains an invalid number"+e.getMessage());
            return 0;
        }
    }


public static void main(String[] args) throws IOException {
    double averageAge = calculateAverageAge("D:\\VS CODE Projects\\Java Practices\\Week 5\\Assignments\\src\\People.csv");
    System.out.println("Average Age = " + String.format("%.2f", averageAge));
}

}