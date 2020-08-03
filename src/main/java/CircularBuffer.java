public class CircularBuffer {

    private int buffersize = 10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;


    public boolean isEmpty() {
        return buffersize == 10;
    }

    public void writeData(String input) {
        buffersize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return buffersize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

}
