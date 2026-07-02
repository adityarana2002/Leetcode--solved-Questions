class Solution {
    public boolean isPalindrome(int x) {
        int num =0;
        int val =0;
        int value = x;
        if(x<0){
            return false;
        }
        while(x!=0){
           
            num = x%10;
            x = x/10;
            val = val*10 + num;

        }
        System.out.println("val value : "+val+" X value: "+x);
        
        if(val==value){
            return true;
        }
        return false;
    }
}