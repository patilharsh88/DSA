class DiamondElement{
    public static long countEvenSumPairs(int n) {
        long even = n / 2;        
        long odd = n - even;      
        
        return (even * (even + 1)) / 2 + (odd * (odd + 1)) / 2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countEvenSumPairs(n)); 
    }
  
}
