import java.util.HashMap;
public class Map_List {

    public static void main(String[] args)
    {
        HashMap m = new HashMap();
        m.put(1,"Ashwin");
        m.put(null,12);
        m.put(null,null);
        m.put(12,"Neo");
        System.out.println("HashMap:"+m);
        HashMap n = new HashMap();
        n.putAll(m);
        System.out.println("HashMap contains:"+n);
        n.remove(1);
        System.out.println("HashMap after remove: "+n);
    }
    
}
