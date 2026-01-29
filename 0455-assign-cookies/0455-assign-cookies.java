class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i = g.length-1;
        int j = s.length-1;
        int max =0;
        while(i>=0 && j>=0)
        {
            if (s[j] >= g[i]) {   
                max++;
                i--;
                j--;
            } 
            else 
                i--;
            
        }
        return max;
    }
}