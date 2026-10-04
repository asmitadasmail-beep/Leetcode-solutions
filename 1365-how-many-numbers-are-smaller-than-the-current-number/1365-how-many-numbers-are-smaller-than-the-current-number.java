class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int small=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=nums[i]){
                    if(nums[j]<nums[i]){
                        small+=1;
                    }
                }
            }
            arr[i]=small;
        }
        return arr;
    }
}