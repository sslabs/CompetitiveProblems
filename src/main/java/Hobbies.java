import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hobbies {
    public String extract(String raw) {
        Pattern hobbiesArrayPattern = Pattern.compile(
                "\\{.*\\\"hobbies\\\"\\s*:\\s*\\[(.*)\\]\\s*\\}");
        Matcher matcher = hobbiesArrayPattern.matcher(raw);

        if (matcher.matches()) {
            String[] hobbies = matcher.group(1).split(",");

            for (int i = 0; i < hobbies.length; i++) {
                hobbies[i] = hobbies[i].trim().replace("\"", "");
            }

            return String.join(", ", hobbies);
        }

        return "";
    }
}
