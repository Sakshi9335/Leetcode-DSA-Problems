class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> ans = new HashSet<>();
        for (String s : bannedWords) {
            ans.add(s);
        }
        int count = 0;
        for (String msg : message) {
            if (ans.contains(msg)) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }

        return false;
    }
}