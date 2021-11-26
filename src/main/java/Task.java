import java.util.Arrays;
import java.util.List;

public class Task {
    public String result(Integer[] array) {
        String[] strings = Arrays.stream(array)
                .map(String::valueOf)
                .toArray(String[]::new);
        return result(strings);
    }

    public String result(String[] array) {
        return "[" + String.join(", ", array) + "]";
    }

    public String result(List<String> list) {
        String[] strings = list.toArray(new String[0]);
        return "[" + String.join(", ", strings) + "]";
    }
}
