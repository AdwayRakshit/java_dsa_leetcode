class Solution {
    public int strStr(String haystack, String needle) {
      
        if(haystack.contains(needle)==true){
            return (haystack.indexOf(needle));
        }
        else 
        return -1;
    }
}