import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Дан массив строк.
 * Необходимо удалить из него все дубли,
 * оставшиеся строки объединить в одну
 * в порядке следования в массиве.
 */
public class Main {
    public static void main(String[] args) {

        String[] str = {"1", "2", "3", "1", "0"};
        String collect = Arrays.stream(str).distinct().collect(Collectors.joining(" "));
        System.out.println(collect);

    }


}