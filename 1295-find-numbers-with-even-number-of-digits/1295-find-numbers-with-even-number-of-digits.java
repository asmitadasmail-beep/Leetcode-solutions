class Solution {
    public int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int c=temp;
            int count = 0;
            while(c>0){
                count+=1;
                c=c/10;
            }
            if(count%2==0){
                totalCount+=1;
            }
        }
        return totalCount;
    }
    public void main(){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}