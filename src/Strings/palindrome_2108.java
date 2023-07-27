package Strings;

public class palindrome_2108 {
    public static void main(String[] args) {
        String[] words = {"abc","car","adaa","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

        public static String firstPalindrome(String[] words) {
            for(String s:words){
                StringBuilder sb=new StringBuilder(s);
                sb.reverse();
                if(s.equals(sb.toString()))
                    return s;
            }
            return "";
        }

}
