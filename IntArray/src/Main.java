public class Main {
    public static void main(String[] args) {

        IntegerCheck check = new IntegerCheck();

        int arr[] = { 5, -1, -3 };
        System.out.println("The smallest non occurring integer in the given array is "+check.Solution(arr));
    }
}