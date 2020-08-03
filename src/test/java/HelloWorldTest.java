import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void Should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String s = h.sayHi();
        assertEquals("Hello World",s);
    }

    @Test
    public void Should_return_Boat() {
        HelloWorld h = new HelloWorld();
        String s = h.sayHi("Boat");
        assertEquals("Hello Boat",s);
    }

    @Test
    public void Should_return_Supachai() {
        HelloWorld h = new HelloWorld();
        String s = h.sayHi("Supachai");
        assertEquals("Hello Supachai",s);
    }
}