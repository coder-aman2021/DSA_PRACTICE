class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max  = Integer.MIN_VALUE ;
        for(int i = 0 ; i<nums.length ; i++){
            int min = nums[i] ;
            max  = Math.max(max , nums[i]) ;
            for(int j = i ; j<nums.length ; j++){
                min = Math.min(min , nums[j]) ;
                
            }
              int score  = max - min ;
                if(score<=k)
                return  i ;
        }
        return -1 ;
        // int low  ;
        // int max  = Integer.MIN_VALUE  ;
        //     int min = Integer.MAX_VALUE  ;

        // for(low = 0 ; low<nums.length ; low++ ){
        //     max  = Math.max(max ,nums[low]) ;
        //     min = Math.min(min , nums[low]) ;
        // }
        // int score  = max  - min ;
        // if(scor)
    }
}