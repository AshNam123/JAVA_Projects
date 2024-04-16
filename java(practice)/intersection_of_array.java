import java.util.HashSet;

public class intersection_of_array {
     public static void main(String[] args){
        int arr1[] = {4,1,2,3};
        int arr2[] = {5,4,7,8};
        printintersection(arr1,arr2);
     }
     public static void printintersection(int[] arr1,int[] arr2){
              HashSet<Integer> h = new HashSet<>();
              for (int i=0;i<arr1.length;i++){
                h.add(arr1[i]);
              }
              for (int i=0;i<arr2.length;i++){
                if(h.contains(arr2[i])){
                    System.out.println(arr2[i]);
                }
              }
     }
    
}
