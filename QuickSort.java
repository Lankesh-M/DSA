class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 2, 4, 9, 8};
        QuickSort(arr, 0, arr.length-1);
        for(int i=0; i<8; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = fixed(arr, low, high);
            QuickSort(arr, low, partition-1);
            QuickSort(arr, partition+1, high);
        }
    }
    
    public static int fixed(int[] arr, int low, int high) {
        int pivot = low;
        int i = low + 1;  // Corrected starting index for i
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= arr[pivot]) {
                i++;
            }
            while (j >= i && arr[j] > arr[pivot]) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
