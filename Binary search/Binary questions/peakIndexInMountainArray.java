public class peakIndexInMountainArray {
    public static void main(String[] args) {   
    }
    public int peakIndexInMountainArray(int[] arr) { 
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}
// hume start chaiye so purane binary search me jop hum use kerte the ki Start<=end isme startn jo vo baraber hone ke bad Start+1 ho jata tha 
// hu m ise celing meuse kerte the but hume yha exact index address chaiye so start jaise hi end ke baraber jaiy to vo element bhi mil jataq hai 
// tabhi satrt ko return kerA DETE hai