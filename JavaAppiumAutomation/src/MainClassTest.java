import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int localNumber = mainClass.getLocalNumber();
        Assert.assertEquals("Метод getLocalNumber не возвращает число 14", 14, localNumber);
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int classNumber = mainClass.getClassNumber();
        Assert.assertTrue("Метод getClassNumber не возвращает число больше 45", classNumber > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String classString = mainClass.getClassString();
        boolean wordHello = classString.contains("Hello");
        boolean wordhello = classString.contains("hello");

        Assert.assertTrue("Метод getClassString не возвращает слова Hello или hello", wordHello || wordhello);
    }
}