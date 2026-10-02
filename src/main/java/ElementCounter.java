import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** Подсчитывает, сколько раз каждое значение встречается в массиве. */
public final class ElementCounter {
    private ElementCounter() {}

    public static <T> Map<T, Integer> countElements(T[] elements) {
        Objects.requireNonNull(elements, "elements");
        Map<T, Integer> counts = new LinkedHashMap<>();
        for (T element : elements) {
            counts.merge(element, 1, Integer::sum);
        }
        return counts;
    }
}
