public class loops {
    public static void main(String[] args){
//        for (int i=1; i<=100; i++){
//            System.out.println(i);
//        }

//        int i=1;
//        while(i<=100){
//            System.out.println(i);
//            i++;
//        }

//        for (int i=100; i>=1; i--){
//            System.out.println(i);
//        }
//        int i=100;
//        while (i>=1){
//            System.out.println(i);
//            i--;
//        }

//        for (int i=5; i<=50; i=i+5){
//            System.out.println(i);
//        }

//        for (int i=1; i<=100; i++){
//            if(i % 2 == 0){
//                System.out.println(i + " is Even");
//            }else{
//                System.out.println(i + " is Odd");
//            }
//        }

//        int a = 10, b = 20;
//        if(a>b){
//            System.out.println(a + " is bigger than " + b);
//        }else {
//            System.out.println(b + " is bigger than " + a);
//        }

        int a=200, b=200, c=200;
        if(a>b && a>c){
            System.out.println(a + " is bigger than all.");
        } else if (b>a && b>c) {
            System.out.println(b + " is bigger than all.");
        } else if (c>a && c>b) {
            System.out.println(c + " is bigger than all.");
        } else if (a==b && a!=c) {
            System.out.println("a and b are equal but " + c + " is different.");
            
        }else if (a==c && a!=b) {
            System.out.println("a and c are equal but" + b + " is different.");

        }else if (b==c && b!=a) {
            System.out.println("b and c are equal but " + a + " is different.");
        }else{
            System.out.println("All are equal.");
        }

    }
}
