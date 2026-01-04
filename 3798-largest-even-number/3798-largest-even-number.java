class Solution {
    public String largestEven(String s) {
       return s.substring(0, s.lastIndexOf('2') + 1);
    }
}