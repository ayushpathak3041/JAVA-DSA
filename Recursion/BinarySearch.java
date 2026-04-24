public class BinarySearch {
    public static int Search(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
         int m=s+(e-s)/2;
         if(target==arr[m]){
            return m;
         }
         if(target>arr[m]){
            return Search(arr, target, m+1, e);
         }
         return Search(arr, target, s, m-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=6;
        int e=arr.length-1;
        System.out.println(Search(arr, target, 0,e));
    }
}
