import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CharacterDescending_order {
    public static void main(String[] args){
        String s="Banannas";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length();i++){
            char cs = s.charAt(i);
            Integer value = map.get(cs);
            if (value!=null){
                map.put(cs ,new Integer(value+1));
            }else{
                map.put(cs,1);
            }
        }
        Set<Entry<Character,Integer>> set = map.entrySet();
        List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
        Collections.sort(list,new Comparator<Map<Character,Integer>>(){
                         
        });
    }
}
