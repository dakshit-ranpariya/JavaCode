package Strings;

public class leetcode_2114 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            max = Math.max(max, count(sentences[i]));
            // max = Math.max(max, (sentences[i].split(" ")).length);
        }
        return max;
    }
    public static int count(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }
}
