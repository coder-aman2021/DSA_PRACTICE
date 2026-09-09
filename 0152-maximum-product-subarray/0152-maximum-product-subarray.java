class Solution {
    public int maxProduct(int[] nums) {
       
       int  maxpro = nums[0];
       for(int i = 0 ; i<nums.length ; i++){
        int  pro = 1 ;
        for(int j = i ; j<nums.length ; j++){
                  
             pro *= nums[j] ;
        maxpro =  Math.max(maxpro , pro) ;
        }
        
       }
       return maxpro ;
    }
}