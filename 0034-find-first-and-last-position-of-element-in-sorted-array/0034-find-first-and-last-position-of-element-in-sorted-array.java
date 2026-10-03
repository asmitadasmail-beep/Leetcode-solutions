//sorted array --> binary search twice -->proper approach O(log n)
//brute force = linear search twice ->one from start and one from end O(n)
//OR LINEAR SEARCH -> one time, store first and keep updating last, then return both as array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        return new int[]{start,end};
    }
    public int search(int[] nums, int target, boolean pos){
        int start=0;
        int end=nums.length-1;
        int ele=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                ele=mid;
                if(pos){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ele;
    }
}