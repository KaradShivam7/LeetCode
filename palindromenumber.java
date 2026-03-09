class palindromenumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev = new StringBuffer(str).reverse().toString();

        if(rev.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}