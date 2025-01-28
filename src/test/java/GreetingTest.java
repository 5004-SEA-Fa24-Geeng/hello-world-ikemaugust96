import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.Greeting;

public class GreetingTest {
    private Greeting usa;
    private Greeting hawaii;
    private Greeting china;

    @BeforeEach
    public void setUp() {
        usa = new Greeting(1, "USA");
        hawaii = new Greeting(2, "Hawaii", "Aloha");
        china = new Greeting(3, "China", "Ni Hao", "你好", "%s, %s!");
    }

    @Test
    public void testDefaultConstructor() {
        Greeting greeting = new Greeting(1, "USA");
        assertEquals(1, greeting.getLocalityID());
        assertEquals("USA", greeting.getLocalityName());
        assertEquals("Hello", greeting.getAsciiGreeting());
        assertEquals("Hello", greeting.getUnicodeGreeting());
        assertEquals("%s, %s!", greeting.getFormatStr());
    }

    @Test
    public void testSingleGreetingConstructor() {
        Greeting greeting = new Greeting(2, "Hawaii", "Aloha");
        assertEquals(2, greeting.getLocalityID());
        assertEquals("Hawaii", greeting.getLocalityName());
        assertEquals("Aloha", greeting.getAsciiGreeting());
        assertEquals("Aloha", greeting.getUnicodeGreeting());
        assertEquals("%s, %s!", greeting.getFormatStr());
    }

    @Test
    public void testFullConstructor() {
        Greeting greeting = new Greeting(3, "China", "Ni Hao", "你好", "%s, %s!");
        assertEquals(3, greeting.getLocalityID());
        assertEquals("China", greeting.getLocalityName());
        assertEquals("Ni Hao", greeting.getAsciiGreeting());
        assertEquals("你好", greeting.getUnicodeGreeting());
        assertEquals("%s, %s!", greeting.getFormatStr());
    }

    @Test
    public void testGetFormatStr() {
        assertEquals("Hello, %s!", usa.getFormatStr(true));
        assertEquals("Aloha, %s!", hawaii.getFormatStr(true));
        assertEquals("Ni Hao, %s!", china.getFormatStr(true));
        assertEquals("%s, 你好!", china.getFormatStr(false));
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, John!", String.format(usa.getFormatStr(true), "John"));
        assertEquals("Aloha, John!", String.format(hawaii.getFormatStr(true), "John"));
        assertEquals("Ni Hao, John!", String.format(china.getFormatStr(true), "John"));
        assertEquals("John, 你好!", String.format(china.getFormatStr(false), "John"));
    }

    @Test
    public void testToString() {
        String expected = "{localityID:1, localityName:\"USA\", asciiGreeting:\"Hello\", unicodeGreeting:\"Hello\"}";
        assertEquals(expected, usa.toString());
    }
}
