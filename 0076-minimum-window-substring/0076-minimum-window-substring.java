class Solution {
    public boolean contains(int mapS[] ,int mapT[]){
        for(int  i = 0 ; i<256 ;i++){
              if(mapT[i]>mapS[i])
        return false  ;
    
        }
         return true  ;
    }
    public String minWindow(String s, String t) {
        int mapS[]  = new int[256] ;
        int mapT[] = new int[256] ;
        for(char ch : t.toCharArray()){
            mapT[ch]++ ;
        }
        int left  = 0 ;
        int minlen  = Integer.MAX_VALUE ;
        int minst  = 0 ;
        for(int right = 0 ; right<s.length() ; right++){
            mapS[s.charAt(right)]++ ;
            while(contains(mapS ,mapT)){
                if(right - left + 1 < minlen){
                    minlen  = right - left +1  ;
                    minst = left  ;
                }
                mapS[s.charAt(left)]-- ;
                left++ ;
            }

        }
        if(minlen==Integer.MAX_VALUE )
        return "" ;
        else
        return   s.substring(minst , minst+minlen);

       
    }
}