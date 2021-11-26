import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTask {

    @Test
    public void TestPrintArrayInt() {
        Task task = new Task();
        String result = task.result(new Integer[] {1, 2, 3});
        Assert.assertEquals("[1, 2, 3]", result);
    }

    @Test
    public void TestPrintArrayString() {
        Task task = new Task();
        String result = task.result(new String[] {"one", "two", "three"});
        Assert.assertEquals("[one, two, three]", result);
    }

    @Test
    public void TestPrintStringList() {
        Task task = new Task();
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        String result = task.result(list);
        Assert.assertEquals("[one, two, three]", result);
    }
}
