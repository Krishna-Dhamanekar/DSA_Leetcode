// Problem: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)



class Solution {
    public int search(int[] nums, int target) {

        int high,low,mid;
        high=nums.length-1;
        low=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
        
    }
}