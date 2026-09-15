class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length ;
        int sat = 0 ;
        for(int  i =  0 ; i<n ; i++){
            if(grumpy[i]==0)
            sat += customers[i] ;

        }
        int notsat = 0 ;
        for(int  i= 0 ; i< minutes; i++){
            if(grumpy[i]==1)
            notsat  += customers[i]  ;
        }
        int max  = notsat ;
        for(int right = minutes ; right<grumpy.length ; right++){
            if(grumpy[right]==1){
                notsat += customers[right] ;
            }
            if(grumpy[right - minutes]==1){
                notsat -= customers[right - minutes] ;
            }
            max  = Math.max(max  , notsat) ;
        }
        return max + sat ;
    }
}