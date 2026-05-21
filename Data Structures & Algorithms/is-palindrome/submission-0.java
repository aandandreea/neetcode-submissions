class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch);
        }
        String reversed = sb.reverse().toString();

        if(reversed.equals(s)){
            return true;
        }
        return false;
    }
}
