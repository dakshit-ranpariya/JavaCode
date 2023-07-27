import java.sql.SQLOutput;

public class matrix {
    public static void main(String[] args){
        int[][] mat = { {1, 5, 7},
                        {4, 80, 90},
                        {6, 10, 11}};

//        shortestpath(mat);
//        System.out.println();

//        rowwiseandcolwise(mat, 6);
//        System.out.println();
//
//        binarySearch(mat, 0);
//        System.out.println("Binary Search");
//
        int psum;
        psum = diagonalSum(mat);
        System.out.println(psum);
        System.out.println();

        System.out.println("Max Delete");
        maxeledelete(mat);

        highestsum(mat);
        System.out.println();

        printzigzag(mat);
        System.out.println();

        printTraverse(mat);
        System.out.println();

        printRev(mat);
        System.out.println();

        int sum=sum(mat);
        System.out.println(sum);
        System.out.println();

        find(mat, 7);
        System.out.println();
    }

    private static void shortestpath(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(c==0 && r==0){
                    continue;
                }else if(c==0) {
                    mat[r][c] = mat[r][c] + mat[r - 1][c];
                }else if(r==0){
                    mat[r][c] = mat[r][c] + mat[r][c-1];
                }
                else{
                    mat[r][c] = mat[r][c] + Math.min(mat[r][c-1], mat[r-1][c]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }

    private static void rowwiseandcolwise(int[][] mat, int val) {
        int row = mat.length;
        int col = mat[0].length;

        int r = 0;
        int c = col-1;

        while(c >= 0 && r <= row-1){
            if(val == mat[r][c]){
                System.out.println("Present");
                return;
            }else if(val > mat[r][c]){
                r++;
            }else{
                c--;
            }
        }
        System.out.println("Not Present");
    }

    private static void binarySearch(int[][] mat, int val) {
        int row = mat.length;
        int col = mat[0].length;

        int top=0;
        int bottom=row-1;

        int rowToBeSearched = -1;

        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(mat[mid][0] <= val && mat[mid][col-1] >= val){
                rowToBeSearched = mid;
                break;
            }else if(mat[mid][0] > val){
                bottom = mid-1;
            }else{
                top = mid+1;
            }
        }

        if(rowToBeSearched == -1){
            System.out.println("Not Present");
            return;
        }

        int left = 0;
        int right = col-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(mat[rowToBeSearched][mid] == val){
                System.out.println("Value is present");
                return;
            }else if(mat[rowToBeSearched][mid] > val){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println("Not present");
    }

    public static int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;

        int psum = 0;
         for(int i=0; i<row; i++){
             psum+= mat[i][i];
             if(i!=col-i-1){
                 psum+=mat[i][col-i-1];
             }
         }
        return psum;
    }

    private static void maxeledelete(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int maxIndex = 0;

//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//
//                if(mat[i][j] > mat[i][maxIndex]){
//                    maxIndex = j;
//                }
//            }
//            for(int k=maxIndex; k<col-1; k++){
//                mat[i][k] = mat[i][k+1];
//            }
//        }
//        col--;

        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                if(mat[i][j] > mat[maxIndex][j]){
                    maxIndex = i;
                }
            }
            for(int k=maxIndex; k<row-1; k++){
                mat[k][j] = mat[k+1][j];
            }
        }
        row--;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void highestsum(int[][] mat) {
        int maxsrow=Integer.MIN_VALUE;
        int maxscol=Integer.MIN_VALUE;
        for(int i=0; i<mat.length; i++){
            int sumrow=0;
            for(int j=0; j<mat[0].length; j++){
                sumrow+= mat[i][j];
                maxsrow = Math.max(maxsrow, sumrow);
            }
        }
        System.out.println("Max sum row: " + maxsrow);

        for(int i=0; i<mat[0].length; i++){
            int sumcol=0;
            for(int j=0; j<mat.length; j++){
                sumcol+= mat[j][i];
                maxscol = Math.max(maxscol, sumcol);
            }
        }
        System.out.println("Max sum col: " + maxscol);
    }

    private static void printzigzag(int[][] mat) {
        int oddRow = 1;
        int evenRow = 0;
        while(evenRow < mat.length){
            for(int i=0; i<mat[0].length; i++){
                System.out.print(mat[evenRow][i] + " ");
            }
            evenRow = evenRow + 2;
            System.out.println();
            if(oddRow<mat.length){
                for(int i=mat[0].length-1; i>=0; i--){
                    System.out.print(mat[oddRow][i] + " ");
                }
            }
            oddRow = oddRow + 2;
            System.out.println();
        }

    }

    private static void printTraverse(int[][] mat) {
        for(int i=0; i<mat[0].length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    private static void printRev(int[][] mat) {
        for(int i=mat.length-1; i>=0; i--){
            for(int j=mat[0].length-1; j>=0; j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sum(int[][] mat) {
        int sum=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    private static void find(int[][] mat, int value) {
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(value==mat[i][j]){
                    System.out.println("YES");
                    return;
                }
            }

        }
        System.out.println("NO");
    }
}
