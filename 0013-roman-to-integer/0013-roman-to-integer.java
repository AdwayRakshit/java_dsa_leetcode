class Solution {
  public static int romanToInt(String s) {
            int n=s.length();
            int roman[]=new int[n];
            char ch;
            int prev=0;

            for(int i=0;i<n;i++){
                ch=s.charAt(i);
                switch(ch){
                    case 'I':roman[i]=1;break;
                    case 'V':roman[i]=5;break;
                    case 'X':roman[i]=10;break;
                    case 'L':roman[i]=50;break;
                    case 'C':roman[i]=100;break;
                    case 'D':roman[i]=500;break;
                    case 'M':roman[i]=1000;break;
                }
    
            }
            int sum=roman[n-1];
            
           for(int i=n-2;i>=0;i--){
            if(roman[i]<roman[i+1])
            sum-=roman[i];
            else{
                sum+=roman[i];
            }
           }
           
          return sum;
        }
    

}