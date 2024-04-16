public class Greater_element_array {
    public static void main(String[] args){
        int array[] = {11,21,13,14};
        printNextGreaterElement(array);
    }
    public static void printNextGreaterElement(int[] array){
        int next,i,j;
        for(i=0;i<array.length;i++){
            next=-1;
            for(j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    next=array[j];
                    break;
                }
            }
            System.out.println(array[i]+","+next);

        }
    }
}
