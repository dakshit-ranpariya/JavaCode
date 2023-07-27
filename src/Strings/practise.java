package Strings;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class practise {
    public static void main(String[] args){

        // Convert first letter of words to uppercase in string

//        String str = "hello, my name is Dakshit";
//        StringBuilder sb = new StringBuilder("");
//
//        char ch = Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//
//        for(int i=1; i<str.length(); i++){
//            if(str.charAt(i) == ' ' && i<str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            }else{
//                sb.append(str.charAt(i));
//            }
//        }
//        System.out.println(sb);




        // Q15 Remove duplicate chars from string
//        String str = "remove duplicate remove";
//        int[] arr = new int[128];
//        for(int i=0; i<str.length(); i++){
//            arr[str.charAt(i)]++;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (arr[ch] == 1) System.out.print(ch);
//        }









        // Q14 Check if string have equal digits and chars
//        String str = "he1l2lo ja3va4";
//        int zero = (int)'0';
//        int nine = (int)'9';
//
//        int ch = 0;
//        int dig = 0;
//
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == ' ') continue;
//            if(str.charAt(i) >= zero && str.charAt(i) <= nine){
//                dig++;
//            }
//            else{
//                ch++;
//            }
//        }
//        if(dig == ch){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }






            // Q13 Check if all words are palindrome
//        String str = "nitin naman";
//        String[] arr = str.split(" ");
//        for(int i=0; i< arr.length; i++){
//            if(!palindrome(arr[i])){
//                System.out.println("Not palindrome");
//                return;
//            }
//        }
//        System.out.println("Palindrome");







        // Q12 Merge Strings Alternatively
//        String str1 = "aa ab bb";
//        String str2 = "c cc ddd";
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<str1.length(); i++){
//            sb.append(str1.charAt(i));
//            sb.append(str2.charAt(i));
//        }
//        System.out.println(sb);







        // Q11 remove All Digits
//        String str = "he1llo ja2va";
//        int asciiNine = (int)'9';
//        int asciiZero = (int)'0';
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) >= asciiZero && str.charAt(i) <= asciiNine){
//                continue;
//            }
//            sb.append(str.charAt(i));
//        }
//        System.out.println(sb);









        // Q10 Reverse Words in a String
//        String str = "Yogi Gogi";
//        String[] arr = str.split(" ");
//
//        for(int i=0; i<arr.length; i++){
//            reverse(arr[i]);
//        }






        // Q9 Remove Vowels from a String
//        String str = "java";
//        String ans = "";
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                continue;
//            }
//            ans += str.charAt(i);
//        }
//        System.out.println(ans);




        // Q8 Print frequency of all the characters in string
//        String s1 = "java";
//        int[] arr = new int[128];
//        for(int i=0; i<s1.length(); i++){
//            int ascii = (int)s1.charAt(i);
//            arr[ascii]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > 0){
//                char ascii = (char)i;
//                System.out.println(arr[i] + " " + ascii);
//            }
//        }








        // Q7 Sort string of characters
//        String s1 = "hello";
//        char[] arr= s1.toCharArray();
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j< arr.length-1-i; j++){
//                if(arr[j] > arr[j+1]){
//                    char temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        Arrays.sort(arr);
//        s1 = new String(arr);
//        System.out.println(s1);




        // Q6 Update a character in a string (without using .replace() function)
//        String s1 = "abcdhf";
//        char[] arr = s1.toCharArray();
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] == 'h'){
//                arr[i] = 'e';
//            }
//        }
//        s1 = new String(arr);
//        System.out.println(s1);



        // Q5 Program to check if two strings are same or not (without using inbuilt function .equals())
//        String s1 = "NAMAN";
//        String s2 = "NAMAN";
//        int i=0, j=0;
//        if(s1.length() != s2.length()){
//            System.out.println(false);
//            return;
//        }
//        while(i<s1.length()){
//            if(s1.charAt(i) != s2.charAt(j)){
//                System.out.println(false);
//                return;
//            }else{
//                i++;
//                j++;
//            }
//        }
//        System.out.println(true);




        // Q4 find duplicate chars from string
//        String str = "NAMAN MAYUR";
//        int[] arr = new int[128];
//        for(int i=0; i<str.length(); i++){
//            char c = str.charAt(i);
//            int ascii = (int)c;
//            int existing = arr[ascii];
//            arr[ascii] = existing +1;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > 1){
//                System.out.print((char)i + " ");
//            }
//        }



        // Q3 count words in a string
//        String s1 = "abc def";
//        int n = s1.split(" ").length;
//        System.out.println(n);






        // Q2 palindrome
//        String s1 = "abcbba";
//        for(int i=0; i<s1.length()/2; i++){
//            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
//                System.out.println("String is not palindrome");
//                return;
//            }
//        }
//        System.out.println("String is palindrome");



        // Q1 reverse
//        String s1 = "abcba";
//        char[] arr = s1.toCharArray();
//        int left = 0, right = s1.length()-1;
//        while(left<right){
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        s1 = new String(arr);
//        System.out.println(s1);




    }

    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    private static void reverse(String str){
        char[] arr = str.toCharArray();
        int left = 0, right = str.length()-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        str = new String(arr);
        System.out.print(str + " ");
    }
}
