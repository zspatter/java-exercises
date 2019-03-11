/**
 * https://github.com/jsquared21/Intro-to-Java-Programming
 */

public class Queue
{
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue(int capacity)
    {
        elements = new int[DEFAULT_CAPACITY];
    }

    public Queue()
    {
        this(8);
    }

    public void enqueue(int v)
    {
        if (size >= elements.length)
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue()
    {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        size--;
        return v;
    }

    public boolean empty()
    {
        return size == 0;
    }

    public int getSize()
    {
        return size;
    }
}
