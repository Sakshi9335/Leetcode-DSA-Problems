class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n =nums.length;
        int [] res = new int[n];
        for (int i = 2*n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i % n] >= st.peek()) {
                st.pop();
            }
            if (i<n){
            if (st.isEmpty()){
            res[i] = -1;  
            }
            else {
                res[i] = st.peek();
            }
            }
            st.push(nums[i%n]);
        }  
        return res;
    }
}