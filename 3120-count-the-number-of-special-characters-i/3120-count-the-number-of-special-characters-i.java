class Solution {
    public int numberOfSpecialChars(String word) {
            HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
         for(char ch : word.toCharArray())
        {
            if(Character.isLowerCase(ch))
                lower.add(ch);
            else
                upper.add(ch);
        }

        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            if(lower.contains(ch) && upper.contains(Character.toUpperCase(ch)))
            {
                count++;
            }
        }

        return count;

    }
}