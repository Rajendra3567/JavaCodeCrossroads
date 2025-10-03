public class SortExample {
    public static void main(String[] args) {
//         5,3,4,1,2 | 35412  34512 34152 34125
        int arr[] = {5,3,4,1,2};

    /*    for(int i = 0; i< arr.length; i++) {
            for(int j =0; j<arr.length -1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for( int num : arr) {
            System.out.print(num + " ");
        } */

//        selection
        for(int i = 0; i< arr.length; i++) {
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sort: ");
        for( int num : arr) {
            System.out.print(num + " ");
        }


    }
}
