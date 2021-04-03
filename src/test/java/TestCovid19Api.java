import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class TestCovid19Api {

    @Test
    public void testCovid19ApiGet() {
        Covid19Api covid19Api = new Covid19Api();
        JSONObject json = covid19Api.get();
        Assert.assertNotNull(json);
    }
}
