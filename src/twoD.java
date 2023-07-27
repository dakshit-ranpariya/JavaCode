public class twoD {
    public static void main(String[] args){
        int[][] arr= {
                    {10, 20, 30, 40, 50},
                    {70, 75, 80, 90, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25}
        };
        int n=arr.length, m=arr.length;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while((rowStart <= rowEnd) && (colStart <= colEnd)){
            for (int i=colStart; i<=colEnd; i++){
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++){
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;

            for(int i=colEnd; i>=colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;

            for(int i=rowEnd; i>=rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++;


            System.out.println();
        }
    }
}
