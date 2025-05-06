import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVStreamProcessor {
    public static double calculateAverageAge(String csvFilePath) throws IOException {
        Files.lines(Paths.get(csvFilePath));
        Stream<String> Lines = Files.lines(Paths.get(csvFilePath));
        return Lines
                .skip(1)
                .filter(Age -> Age != null)
                .map(line -> line.split(","))
                .mapToInt(fields ->Integer.parseInt(fields[1]))
                .average().orElse(0.0);
    }
}
