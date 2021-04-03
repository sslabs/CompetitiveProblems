import org.junit.Assert;
import org.junit.Test;

public class TestHobbies {

    @Test
    public void testHobbiesOne() {
        Hobbies hobbies = new Hobbies();
        String result = hobbies.extract("{\"name\":\"John Smith\",\"age\":25,\"hobbies\":[\"running\",\"coding\",\"camping\"]}");
        Assert.assertNotNull(result);
        Assert.assertEquals("running, coding, camping", result);
    }

    @Test
    public void testHobbiesTwo() {
        Hobbies hobbies = new Hobbies();
        String result = hobbies.extract("{\"name\":\"John Smith\",\"age\":25,\"hobbies\":[\"running\"]}");
        Assert.assertNotNull(result);
        Assert.assertEquals("running", result);
    }

    @Test
    public void testHobbiesThree() {
        Hobbies hobbies = new Hobbies();
        String result = hobbies.extract("{\"name\":\"John Smith\",\"age\":25,\"hobbies\":[]}");
        Assert.assertNotNull(result);
        Assert.assertEquals("", result);
    }
}
