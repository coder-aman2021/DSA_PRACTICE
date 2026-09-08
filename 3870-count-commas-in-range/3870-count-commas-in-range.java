class Solution {
    public int countCommas(int n) {
       int ans  = 0 ;
       int st = 1000 ;
       int comma  = 1 ;
       while(st<=n){
        int end  = st*1000 - 1 ;
        int last  = Math.min(n , end) ;
        int no = last  - st + 1 ;
        ans += no*comma ;
        st *= 1000 ;
        comma++ ;
       }
       return ans ;
    }
}