

public class maximumwealth {
    public static void main(String[] args) {
      int [][]  accounts= {{1,2,3,4,4}, // 1 person and there is 5 accounthave 14 rs
                          {3,2,34,432,3},// 2nd person there is 5 account have 474 rs
                          {23,34,2,1,2,44}};// 3rxd person there is 6 account
                          // we have to calculate max 
                          System.out.println(maximumwealth(accounts));
    }
    public static int  maximumwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        // for(int[] person : accounts){
        //     int sum=0;
        //     for(int account : person){
        //         sum=sum+accounts[person][account];
        //     }
        // }

        for(int person=0 ; person<accounts.length;person++){
            int sum=0;
            for(int account=0; account<accounts[person].length;account++){
                sum=sum+accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
    
}

    //  public class maximumwealth {

    //     public static int maxwealth(int[][] accounts){
    //         int ans=Integer.MIN_VALUE;
    //         for(int[] person : accounts){
    //             int sum=0;
    //             for(int account : person){
    //                 sum=sum+account;

    //             }
    //             if(sum>ans){
    //                 ans=sum;
    //             }
                
    //         }
    //         return ans;

    //     }
    //     public static void main(String[] args) {
    //         int [][]  accounts= {{1,2,3,4,4}, // 1 person and there is 5 accounthave 14 rs
    //                             {3,2,34,432,3},// 2nd person there is 5 account have 474 rs
    //                             {23,34,2,1,2,44}};// 3rxd person there is 6 account
    //         System.out.println(maxwealth(accounts));
    //     }
    //  }
    