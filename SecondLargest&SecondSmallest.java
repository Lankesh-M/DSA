public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int largest = a[0];
        int smallest = a[0];
        int secondLargest = -1;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > secondLargest){
                secondLargest = a[i];
            }
        }

        for(int i=0; i<n; i++){
            if(a[i] < smallest){
                secondSmallest = smallest;
                smallest = a[i]; 
            }
            else if(a[i] > smallest && a[i] < secondSmallest)
                secondSmallest= a[i];
        }
        int[] op = new int[2];
        op[0] = secondLargest;
        op[1] = secondSmallest;


        return op;

    }
}
