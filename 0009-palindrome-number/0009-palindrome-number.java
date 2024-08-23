class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int sum=0,i;
        if(x<0){
            x=Math.abs(x);
        }
        while(x!=0){
            i=x%10;
            sum=(sum*10)+i;
            x=x/10;
        }  
    if(sum==copy)
    return true;
    return false;
    }
}