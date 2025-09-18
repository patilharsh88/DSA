class StringPalindrome {
    
    public static boolean isPalindrome(String s) {
    
    String str="";
    
    for(int i=s.length()-1;i>=0;i--){
        str=str+s.charAt(i);
    }
    
    if(s.equals(str)){
    return true;
    }
    
    return false;
    }
    
        public static void main(String[] args) {
      
      String s="harsh";
       System.out.println(isPalindrome(s));
    }
}
