class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] temp = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty()  && temperatures[i]>= temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
               temp[i] = -1;
            }
            else {
                temp[i] = st.peek();
            }
            st.push(i);
        }
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            if(temp[i]==-1){
                ans[i] = 0;
            }
            else {
                ans[i] = temp[i]-i;
            }
        }
        return ans;
    }
}