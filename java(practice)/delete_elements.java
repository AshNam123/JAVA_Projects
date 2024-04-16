import java.util.Arrays;

class delete_elements{
    public static int[] remove(int[] array,int element)
    {
        int[] new_Array = new int[array.length-1];
        int index = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=element)
            {
                new_Array[index] = array[i];
                index++;
            }
        } 
        return new_Array;

    }
    public static void main(String[] args)
    {
        int[] Original_Array = {1,2,3,4,5};
        int element_to_remove = 3;
        int[] new_array = remove(Original_Array, element_to_remove);
        System.out.println("Original Array:"+Arrays.toString(Original_Array));
        System.out.println("New_array:"+Arrays.toString(new_array));

    }
}