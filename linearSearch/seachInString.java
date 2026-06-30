public class seachInString {
    public static void main(String[] args) {
         String name="Ayush";
         char target='y';
         System.out.println(search( name, target));

    }
 public static boolean search(String str,char target){
    if(str.length()==0){

        return false;
    }
    for(char ch : str.toCharArray()){
        if (ch==target){
            return true;
        }

    }
    return false;
 }
    
}
