import java.util.*;
import java.util.stream.*;

public class ANameFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Mike", "Amit");
        List<String> filtered = names.stream()
                                     .filter(name -> name.startsWith("A"))
                                     .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
