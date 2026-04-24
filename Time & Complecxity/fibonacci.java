public class fibonacci {
    public static void main(String[] args) {
        
    }
    static double FiboFormula(int i,int n){ 
     //  return (Math.pow((1+Math.sqrt(5)) /2, n) - Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5);
     return (Math.pow((1+Math.sqrt(5)/2),n)-Math.pow((1-Math.sqrt(5)/2),n));
    }
}
