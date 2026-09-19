class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int cnt = 0;
       int maxlen = 0;

       for(int i=0; i<nums.length; i++){
        if(nums[i] == 1){
            cnt++;
            maxlen = Math.max(maxlen,cnt);
        }
        else{
            cnt = 0;
        }
       }
       return maxlen; 
    }
}