class TwoSum {
    
     public static int[] twoSum(int[] nums, int target) {
         
        int[] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
             for(int j=i+1;j<nums.length;j++){
                 if((nums[i]+nums[j])==target){
                      arr[0]=i;
                      arr[1]=j;  
                      return arr;
                 }
             }
        }
        return  new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
       
       int[] nums = {3,3};
       int target = 9;
       
     int[] a=twoSum(nums,target);
     for(int i:a){
         System.out.println(i);
     }
     
    }
}
