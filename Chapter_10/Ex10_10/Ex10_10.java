public class Ex10_10
{
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        for (int i = 1; i < 21; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}
