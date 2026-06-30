public class missingPositive {
    public static void main(String[] args) {
        int [] arr= {2,1,5,4,6,7};
        int ans=firstMissingPositive(arr);
        System.out.println(ans);
    }
    public static  int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
           if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        for(int index=0; index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    private static  void swap(int[] arr, int i, int correctIndex) {
       int temp=arr[i];
       arr[i]=arr[correctIndex];
       arr[correctIndex]=temp;
    }
}
