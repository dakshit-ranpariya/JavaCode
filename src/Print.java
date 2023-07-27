public class Print {


    /*
            1. insert
            2. print
            3. find
            4. update
            5. delete
            6. size
            7. isEmpty
            */
            public static void main(String[] args) {
                int[] arr = new int[3];
                int p = 0;
                p = insert(arr, 10, p);
                p = insert(arr, 20, p);
                p = insert(arr, 30, p);


                update(arr, 30, 40, p);
                find(arr, 40, p);

                p = delete(arr, 10, p);

                print(arr, p);

                System.out.println(isEmpty(p));
            }

            public static int insert(int[] arr, int value, int p){
                if(p == arr.length){
                    System.out.println("Array is full");
                    return p;
                }
                arr[p] = value;
                p++;
                return p;
            }

            public static void print(int[] arr, int p){
                for (int i=0; i<p; i++){
                    System.out.print(arr[i] + " ");
                }
            }

            public static void update(int[] arr, int oldV, int newV, int p){
                for (int i=0; i<p; i++){
                    if(arr[i] == oldV){
                        arr[i] = newV;
                        return;
                    }
                }
            }

            public static void find(int[] arr, int value, int p){
                for (int i=0; i<p; i++){
                    if(arr[i] == value){
                        System.out.println("value is present");
                        return;
                    }
                }
                System.out.println("Not present");
            }

            public static int delete(int[] arr, int value, int p){
                for(int i=0; i<p; i++){
                    if(arr[i] == value){
                        for (int j=i; j<p-1; j++){
                            arr[j] = arr[j+1];

                        }
                    }
                }
                p--;
                return p;
            }

            public static boolean isEmpty(int p){
                if(p == 0){
                    return true;
                }
                return false;
            }
















}



