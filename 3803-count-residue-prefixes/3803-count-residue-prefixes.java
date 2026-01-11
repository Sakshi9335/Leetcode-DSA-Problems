class Solution {
    public int residuePrefixes(String s) {
        int cont=0;
        for(int i=0; i<s.length();i++){
            HashSet<Character> set =new HashSet<>();
            for(int j=0; j<=i; j++){
                set.add(s.charAt(j));
            }
            int len = i+1;
            if(set.size() == len%3){
                cont++;
            }
        }
        
        return cont;
    }
}