public class rotaion_of_eachother {
    public static void main(String[] args){
       System.out.println(isRotated("abcd","bcda"));
    }
    public static boolean isRotated(String str,String Rotated){
        if(str==null || Rotated==null){
            return false;
        }else if(str.length()!=Rotated.length()){
            return false; 
        }else{
            String concatenated = str+str;
            return concatenated.contains(Rotated);
        }
    }
}
