class Solution {
    public int search(int[] nums, int target) {
        int p = pivot(nums);
        if(p==-1){
            //that means array is not rotated
            //just do normal binary search
            return BS(nums,target,0,nums.length-1);
        }
        //if pivot is found, you have found 2 asc sorted arrays
        //3 cases now
        if(nums[p]==target){
            return p;
        }
        int positionF = BS(nums,target,0,p);
        if(positionF!=-1){
            return positionF;
        }
        else{
            return BS(nums,target,p+1,nums.length-1);
        }
    }
    int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //4 cases of finding PIVOT
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
    int BS(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}