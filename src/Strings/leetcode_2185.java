package Strings;

public class leetcode_2185 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words)
            if(word.startsWith(pref)) count++;
        return count;

//        int count=0;
//        for(int i=0; i<words.length; i++){
//            count += count(words[i], pref);
//        }
//        return count;
    }
//    public static int count(String str, String pref){
//        int count=0;
//        for(int i=0; i<pref.length(); i++){
//            if(str.charAt(i) != pref.charAt(i)){
//                return count;
//            }
//            count = 1;
//        }
//        return count;
//    }
}
