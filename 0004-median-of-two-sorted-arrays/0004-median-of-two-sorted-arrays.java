class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ,m = nums2.length;
        int s = m+n;
        int [] temp = new int[s];
        int i =0,j=0,k=0;
        while(i<n && j<m){
            if (nums1[i]<nums2[j]){
                temp[k] = nums1[i];
                i++;
            }
            else {
                temp[k] =  nums2[j];
                j++;
            }
            k++;
        }
        while(i <n){
           temp[k] = nums1[i];
                i++; 
                k++;
        }
        while(j<m){
             temp[k] =  nums2[j];
                j++;
                k++;
        }
        if (s % 2 == 0) {
            int mid = s / 2;
            return (temp[mid] + temp[mid - 1]) / 2.0;
        } else {
            return temp[s / 2];
        }
     }
    
}