class Solution {
    public int totalMoney(int n) {
         int week = n / 7;
          int extra = n %7;   
       int  c1 =0;
       int c2 = 0;         
            for (int i = 0; i <week; i++) {
                    c1 += 28 + (7 * i);
             }
             if ( extra > 0){
                 for (int i = 1; i <=extra; i++) {
                  c2 += week + i;
             }
             }
        
       
      
       return c1+c2;
    }
}