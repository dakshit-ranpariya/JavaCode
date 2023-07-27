
public class multiply {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] ans = new int[n];


        for(int i=0; i<n; i++){
            int lp=1;
            int rp=1;
            int x=0;
            if(x<i){

                for(int j=0; j<i; j++){
                    lp = lp * arr[j];
                }
            }
            for(int k=i+1; k<n; k++){
               rp = rp * arr[k];
            }
            int ans1 = lp*rp;
            arr[i] = ans1;
        }


        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
