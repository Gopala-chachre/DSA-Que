class IsPalindrome {
    public boolean isPalindrome(int x) {
        int rev = 0, temp = 0, xtemp = x;
        if(x == 0) return true;
        while(x > 0){
            temp = x % 10;
            rev = rev*10 + temp;
            x /= 10;
        }
        if(xtemp == rev) return true;
        else return false;
    }
}