import java.util.ArrayList;

class practice{
     public static void main(String[] args)
     {
          ArrayList a = new ArrayList();
          a.add(12);
          a.add(null);
          a.add("Neo");
          a.add(null);
          a.add('a');
          System.out.println("List:"+a);
          ArrayList b = new ArrayList();
          b.addAll(a);
          System.out.println(b);
          b.removeAll(a);
          System.out.println("After remove:"+b);
          System.out.println("Does it contain 12:"+a.contains(12));
          for (Object a1 : a) {
               System.out.println("Each elements are:"+a1);
          }
          
     }
}