class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
int n = citations.length;
int i = n - 1;
int h = 0;
while (i >= 0 && citations[i] >= n - i) {
    h = n - i;
    i--;
}
return h;

    }
}