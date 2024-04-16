import java.util.PriorityQueue;
class Priority {
    public static void main(String[] args)
    {
        PriorityQueue p1  = new PriorityQueue();
        p1.offer(10);
        p1.offer(-5);
        p1.offer(0);
        p1.offer(-25);
        p1.offer(100);
        System.out.println("Priority Queue:"+p1);
        System.out.println(p1.poll());
        System.out.println(p1.poll());
        System.out.println(p1.poll());
        System.out.println("Priority Queue:"+p1);
    }
}
