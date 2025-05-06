import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static <Strings> void main(String[] args) {
        List<Strings> Strings;
        Strings = (List<Strings>) Arrays.asList("banana", "cherry", "Apple");
        System.out.println("List of Strings: " + Strings);


    }


}


