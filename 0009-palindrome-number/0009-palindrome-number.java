class Solution {
    public static boolean isPalindrome(int x) {
        int new_num=0;
        int copy=x;
        while(x>0){
            int a=x%10;
            new_num=new_num*10+a;
            x=x/10;
        }
        if(copy==new_num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int x=121;
        if(isPalindrome(x)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}