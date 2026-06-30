

public class Sqrt {
//     69. Sqrt(x)
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
    public static void main(String[] args) {
        int input=8;
        int answer=Sqrt(input);
        System.out.println(answer);

        //3. Newton-Raphson Method (Advanced but fast)
        // 👉 Formula: x = (x + n/x) / 2;
        // 👉 Keep improving until difference becomes very small.
    }
    public static int Sqrt(int x){
        if(x<2)
        { return x;}
        int start=1,end=x/2,ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;

             if(mid*mid<x){ 
                ans=mid;
                start=mid+1;// we are searching x ; so which side will prefer 
             }
             else if(mid*mid>x){
                end=mid-1;
             }
             else{
                return mid;
             }
        }
        return ans;
    }
  
    
}
