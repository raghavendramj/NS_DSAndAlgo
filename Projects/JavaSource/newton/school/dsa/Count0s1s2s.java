package newton.school.dsa;

public class Count0s1s2s {

    public static void main(String[] args) {
        int result[] = countNums(new int[]{0, 2, 1, 2, 0});
        printElements(result);
    }


    public static void printElements(int arr[]) {

        System.out.print("Elements in the array :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] countNums(int[] nums) {

        int len = nums.length;

        int numberOfOnes = 0;
        int numberOfTwos = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) numberOfOnes++;
            if (nums[i] == 2) numberOfTwos++;
        }

        int numberOfZeros = len - (numberOfOnes + numberOfTwos);

        //First Way
        int i = 0;
        for (; i < numberOfZeros; i++) {
            nums[i] = 0;
        }
        for (; i < numberOfZeros + numberOfOnes; i++) {
            nums[i] = 1;
        }
        for (; i < numberOfZeros + numberOfOnes + numberOfTwos; i++) {
            nums[i] = 2;
        }

        //Second Way
        for (int j = 0; j < len; j++) {
            if (j < len - (numberOfOnes + numberOfTwos)) {
                nums[j] = 0;
            } else if (j < len - numberOfTwos) {
                nums[j] = 1;
            } else {
                nums[j] = 2;
            }
        }

        return nums;
    }
}
