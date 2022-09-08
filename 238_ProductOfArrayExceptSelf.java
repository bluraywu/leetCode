class Solution {
    //https://youtu.be/tSRFtR3pv74
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int[] output=new int[size];
        output[0]=1;
        for(int i = 1;i<size;i++){
            output[i]=nums[i-1]*output[i-1];
        }
        int right=1;
        for(int i = size-1 ; i>=0;i--){
            output[i]=right*output[i];
            right=right*nums[i];
        }
        return output;
    }
}