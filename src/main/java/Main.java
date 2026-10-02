import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] values = {"apple", "pear", "apple", "orange", "pear", "apple"};
        Map<String, Integer> counts = ElementCounter.countElements(values);
        counts.forEach((value, count) -> System.out.println(value + ": " + count));
    }
}
