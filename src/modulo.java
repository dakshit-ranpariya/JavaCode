public class modulo {
    public static void main(String[] args){





//        int a = 5020;
//
//        int year = a / 365;
//        int b = a % 365;
//
//        int month = b / 30;
//        int day = b % 30;
//
//        System.out.println("Years: " + year + ", Months: " + month + ", Days: " + day);



        //---------COUNT NUMBERS--------
        int count=0;
        int n=2002;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);



        //------PALINDROME--------
//        int temp=102010;
//        int num=102010;
//        int reverseNum=0;
//
//        while(temp>0){
//            int lastDig = temp % 10;
//            temp = temp / 10;
//            reverseNum = reverseNum * 10 + lastDig;
//        }
//
//        if(num==reverseNum){
//            System.out.print("Palindrome");
//        }else{
//            System.out.print("Not Palindrome");
//        }
    }
}
