public class IntegerCheck {

    static int Solution(int[] A){
        int length = A.length; //Check the length of the array passed as argument
        int number = 2000000; //maximum element in an array

        boolean[] present = new boolean[number]; //Introduced to Check presence of integers

        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < length; i++){

            if(A[i] > 0 && A[i] <= length)  {
                present[A[i]] = true;

                maxVal = Math.max(maxVal, A[i]);
            }
        }

        for (int i = 1; i < number; i++)
            if (!present[i])
                return i;  // First element absent from the original array


        return maxVal + 1; //If the array is already sorted.

    }
}
