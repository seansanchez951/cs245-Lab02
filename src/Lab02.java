import java.util.Arrays;
import java.util.Scanner;


public class Lab02 {


    // insertion sort function
    public void insertionSort(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            // copy
            int temp = i;
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    // move
                    temp = j;
                }
            }
            // copy back
            int t = arr[temp];
            arr[temp] = arr[i];
            arr[i]=t;
        }
    }

    // function for recommendation 2
    public int [] twoSum(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length;j++) {
                // if the sum of the elements of the ith and jth indices equals the target
                if ((arr[i]+arr[j]==target)) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }


    public static void main(String args[]) {

        Lab02 l = new Lab02();

        // example 1 test
        int[] sums1 = {2,12,8,7};
        int target1 = 9;
        int[] indices1 = l.twoSum(sums1,target1);
        System.out.println("example 1 output: " + Arrays.toString(indices1));

        // example 2 test
        int[] sums2 = {1, 13, 18, 20, 30};
        int target2 = 40;
        int[] indices2 = l.twoSum(sums2,target2);
        System.out.println("example 2 output: " + Arrays.toString(indices2));

        // testing user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int elements = scanner.nextInt();
        int arr[] = new int[elements];

        // user inputs are iterated into an array
        System.out.println("Enter numbers for each element in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // ask user for target value
        System.out.println("Enter the target value: ");
        int target = scanner.nextInt();

        // run selection sort for user input array
        l.insertionSort(arr);

        // print out sorted array
        System.out.println("The Sorted array is: " + Arrays.toString(arr));

        // run the sorted array into twoSum function
        int[] indices3 = l.twoSum(arr,target);

        // print the indices
        System.out.println("Sum of two indices that equal the target: " + Arrays.toString(indices3));


    }



}
