import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.PriorityQueue;

/**
 * This program demonstrates a priority queue of work orders. The
 * most important work orders are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // create a PriorityQueue of WorkOrders
        PriorityQueue<WorkOrder> q = new PriorityQueue<>();

        // add several work orders
        q.add(new WorkOrder(3, "vacuum carpets"));
        q.add(new WorkOrder(2, "water plants"));
        q.add(new WorkOrder(10, "remove pencil sharpener shavings"));
        q.add(new WorkOrder(2, "feed the dog"));
        q.add(new WorkOrder(1, "take Chapter 15 practice quiz"));

        while(q.size() > 0)
        {
            System.out.println(q.remove());
        }
    }
}
