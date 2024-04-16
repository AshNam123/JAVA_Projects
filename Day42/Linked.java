import java.util.LinkedList;
class Linked{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.offer(10);
        l.offer(10.3);
        l.offer("sheela");
        l.offer('c');
        l.offer(false);
        l.offer(null);
        l.offer("sheela");
        System.out.println("LINkedLIst:"+l);
        System.out.println("Peek()"+l.peek());
        System.out.println("LinkedList after Peek():"+l);
        System.out.println("poll():"+l.poll());
        System.out.println("LInkedList after poll():"+l);
        System.out.println("poll():"+l.poll());
        System.out.println("LInkedList after poll():"+l);
    }
}