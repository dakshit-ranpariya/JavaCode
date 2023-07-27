import java.util.*;
public class practice {
    static void func(int n) {

        System.out.print(n);

        return;

    }


    public static void main(String args[]) {

        int n = 5;

        func(n);

    }

        /*
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = new int[arr1.length * 2];
        int j=0;

        for (int i=0; i< arr1.length; i++){
            arr3[j] = arr1[i];
            j++;
            arr3[j] = arr2[i];
            j++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        */















        /*
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[arr.length * 2];
        int j = 0;

        for (int i=0; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
            arr2[j] = arr[i];
            j++;
        }
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        */












        /*
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length * 2];

        int j=0;

        for (int i=0; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }
        for (int i=0; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        */






        //PRINT REVERSE IN NEW ARRAY
        /*
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        int j=0;

        for (int i=arr1.length-1; i>=0; i--){
            arr2[j] = arr1[i];
            System.out.print(arr2[j] + " ");
            j++;
        }

         */




        //STORE REVERSE IN MEMORY
        /*
        int[] arr = {1, 2, 3, 4, 5};

        int i=0, j = arr.length-1, temp;

       while(i<j){
           temp=arr[j];
           arr[j]=arr[i];
           arr[i]=temp;
           i++;
           j--;
       }
        for (int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
         */





        //PRINT REVERSE
        /*
        int[] arr = {1, 2, 3, 4, 5};

        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
         */







        //SUM OF ELEMENTS

//        int[] arr={1, 2, 3, 4, 5};
//
//        int sum = 0;
//
//        for (int i=0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum of array: " + sum);






        //COUNT ODD AND EVEN NUMBERS
        /* int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int even = 0;
        int odd = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
        */

    }

