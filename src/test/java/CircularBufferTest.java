import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void Create_Buffer_Should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่าง", result);
    }
    @Test
    public void Create_new_buffer_with_default_size_should_10(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มนะ", result);

    }
    @Test
    public void Write_data_to_buffer_should_read_A(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }
    @Test
    public void Write_data_and_read_data_later() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        assertEquals("A", cb.readData());
    }
    @Test
    public void Read_data_and_write_data_later() {
        CircularBuffer cb = new CircularBuffer();
        assertTrue(cb.isEmpty());
        cb.writeData("A");
        assertEquals("A", cb.readData());
    }
}