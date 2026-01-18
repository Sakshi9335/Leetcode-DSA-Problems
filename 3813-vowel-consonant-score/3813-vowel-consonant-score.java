class Solution {
    public int vowelConsonantScore(String s) {
        int score =0;
        int v=0;
        int c=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    v++;
                else
                    c++;
            }
        }
        if(c==0){
            return 0;
        }
        score = v/c;
        return score;
    }
}