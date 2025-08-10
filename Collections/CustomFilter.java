import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class CustomFilter  {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anita", "Asha", "Mike", "Aruna", "Rama");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");
        List<String> filtered = names.stream()
                                     .filter(startsWithA.and(endsWithA))
                                     .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
