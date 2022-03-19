package newton.school.dsa.arrays;

public class BubbleSort {

    static int[] sortNumbers(int arr[]) {

        //base condition
        if (arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                //Greater elements are replaced with smaller elements -> Ascending Order Sorting
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array is :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11};
        sortNumbers(arr);
    }

}
