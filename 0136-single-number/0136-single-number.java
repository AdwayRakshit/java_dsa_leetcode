class Solution {
    public int singleNumber(int[] nums) {
       int sum=0;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            sum-=nums[i];
        }
        else{
            sum+=nums[i];
            set.add(nums[i]);
        }
    
       } 
       return sum;
    }
}