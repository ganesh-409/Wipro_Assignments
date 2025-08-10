import java.util.Optional;

public class SafeDivider {
    public static Optional<Integer> divide(int a, int b) {
        return b == 0 ? Optional.empty() : Optional.of(a / b);
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2).orElse(-1)); // Output: 5
        System.out.println(divide(10, 0).orElse(-1)); // Output: -1 (Not Allowed)
    }
}
