class Solution {
    public int countMonobit(int n) {
        int count =0;
        for(int i =0; i<=n; i++){
            String bin = Integer.toBinaryString(i);
            char ch = bin.charAt(0);
            boolean bool = true;
            for(int j =0; j<bin.length(); j++){
                if(bin.charAt(j) != ch){
                    bool = false;
                }
            }
            if(bool)
                count++;
        }
        return count;
    }
}