public class QueueDemo
{
    public static void main(String[] args)
    {
        CircularArrayQueue queue = new CircularArrayQueue();

        queue.add("Tom");
        queue.add("Diana");
        queue.add("Harry");
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.add("f");
        queue.add("g");
        queue.add("h");
        queue.add("i");
        queue.add("j");
        queue.add("k");

        while(!queue.empty())
        {
            System.out.println(queue.remove());
        }
    }
}
