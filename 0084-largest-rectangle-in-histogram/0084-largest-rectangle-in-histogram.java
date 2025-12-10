class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxarea = Integer.MIN_VALUE;
        int[] nextIndx=nse(heights);
        int[] prevIndx=pse(heights);
        for(int i=0;i<n;i++)
        {
           int l=heights[i];
           if(nextIndx[i]==-1)
           nextIndx[i]=n;
           
           int b=nextIndx[i]-prevIndx[i]-1;
           int area=l*b;
           maxarea=Math.max(area,maxarea);
        }
           return maxarea;


    }

     public int[] nse(int[] arr)
    {
        int n = arr.length;
        int[] res=new int[n];
         Stack<Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
        {  
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
              st.pop();

            if(st.isEmpty())
            {
               res[i]=-1;
            }
            else
            {
            res[i]=st.peek();
            } 
            st.push(i);     
        }  
        return res;
    }

    public int[] pse(int[] arr)
    {
        int n = arr.length;
        int[] res=new int[n];
         Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<n;i++)
        {  
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
              st.pop();

            if(st.isEmpty())
            {
               res[i]=-1;
            }
            else
            {
            res[i]=st.peek();
            } 
            st.push(i);     
        }  
        return res;
    }
}