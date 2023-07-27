package Stack;
import java.util.Arrays;
import java.util.Stack;


public class reverse_number {

    public static void main(String[] args) {
        int n=1234;
        int temp=n;
        int top=-1;
        int count = 0;
        while (n!=0) {
            n /= 10;
            count++;
        }
        int arr[] = new int[count];
        int k=count-1;
        while (temp!=0){
            arr[k--]=temp%10;
            temp/=10;
        }
        System.out.println(Arrays.toString(arr));
        int[] stack=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            top=push(stack,top,arr[i]);
        }
        print(stack,top);

    }

    private static void print(int[] stack, int top) {
        int num=0;
        while (top!=-1){
            num =num*10 +stack[top];
            top--;
        }
        System.out.println(num);

    }


    private static int push(int[] stack, int top, int value) {
        top++;
        stack[top]=value;
        return top;
    }


}
