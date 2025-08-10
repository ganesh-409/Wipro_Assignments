import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David", "Anita");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}
