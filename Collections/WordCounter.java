import java.util.*;
import java.util.stream.*;

public class WordCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alexander", "Ravi", "Steve", "Michael");
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();
        System.out.println("Names longer than 5 characters: " + count);
    }
}
