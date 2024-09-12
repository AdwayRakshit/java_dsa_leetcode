class Solution {
    public static int missingNumber(int[] nums) {
           
            int n=nums.length;
            for (int i=0;i<=n-1;i++){
                int count=0;
                for(int j=0;j<=n-1;j++){
                    if(nums[j]==i)
                    count++;
                   
                }
                if(count==0){
                 
                return i;
                } 
                
            }
            return n;
        }
}