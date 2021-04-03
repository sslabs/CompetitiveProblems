import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Covid19Api {

    public JSONObject get() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            }

            StringBuilder inline = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                inline.append(scanner.nextLine());
            }
            scanner.close();

            JSONParser parse = new JSONParser();
            JSONObject data = (JSONObject) parse.parse(inline.toString());

            System.out.println(data.toJSONString());

            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
