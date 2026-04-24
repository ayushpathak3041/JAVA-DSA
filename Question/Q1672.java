public class Q1672 {
     public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0; j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            
        }
    }
}
