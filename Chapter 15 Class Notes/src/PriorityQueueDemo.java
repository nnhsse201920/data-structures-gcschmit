import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // create a priority queue of to-do items
        Queue<WorkOrder> q = new PriorityQueue<>();

        q.add(new WorkOrder(3, "vacuum carpets"));
        q.add(new WorkOrder(2, "water plants"));
        q.add(new WorkOrder(10, "play video games"));
        q.add(new WorkOrder(1, "take Chapter 15 practice quiz"));

        while(q.size() > 0)
        {
            System.out.println(q.remove());
        }
    }
}
