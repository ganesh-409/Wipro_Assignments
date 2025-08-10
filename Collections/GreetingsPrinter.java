@FunctionalInterface
interface Printer {
    void print(String message);
}

public class GreetingsPrinter {
    public static void greet(Printer printer, String message) {
        printer.print(message);
    }

    public static void main(String[] args) {
        greet(msg -> System.out.println("Hello, " + msg + "!"), "Ganesh");
    }
}
