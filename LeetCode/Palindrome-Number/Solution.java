1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x<0){
4            return false;
5      
6    }
7    int original = x;
8    int reverse = 0;
9    while(x!=0){
10        int digit = x%10;
11        reverse = reverse *10+ digit;
12        x = x/10;   }
13        return original ==reverse;
14        
15    }
16}