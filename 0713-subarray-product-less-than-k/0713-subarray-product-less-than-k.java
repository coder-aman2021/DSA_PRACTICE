class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        return 0 ;
        int ans  = 0  ; 
        int pro  = 1 ;
        int left  = 0 ;
    for(int right = 0 ; right<nums.length ; right++){
        pro *=nums[right] ;
      while(pro>=k){
        pro  = pro/nums[left] ;
        left++ ;
       }
        ans += right - left + 1 ;
    }
     return ans;
    }
}