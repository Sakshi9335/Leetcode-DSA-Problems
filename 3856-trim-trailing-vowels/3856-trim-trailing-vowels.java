class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                sb.deleteCharAt(i);
            }
            else
                break;
        }
        return sb.toString();
    }
}