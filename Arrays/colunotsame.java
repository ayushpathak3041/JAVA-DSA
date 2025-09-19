public class colunotsame {
    // we are using this because columns are not same
//     arr
//  │
//  ├── Row 0 → [ 1  2  3  4 ]
//  │
//  ├── Row 1 → [ 5  6 ]
//  │
//  └── Row 2 → [ 7  8  9 ]

    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6},
            {7,8,9} 
                    };

        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){  //arr[i].length → Number of columns in row i.{ ye tab tak chalega jaha tak tumhara column hai}
                System.out.print(arr[i][j]);
            }
            System.out.println();
            
        }
    }
    
}
 