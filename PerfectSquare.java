class PerfectSquare {
    
      public static int countSquares(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        System.out.println(countSquares(9));
    }
}
