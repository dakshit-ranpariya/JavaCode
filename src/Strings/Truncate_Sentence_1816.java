package Strings;

public class Truncate_Sentence_1816 {
    public static void main(String[] args){
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }
    public static String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') count++;
            if(count == k){
                s = s.substring(0, i);
                break;
            }
        }
        return s;
    }
}

