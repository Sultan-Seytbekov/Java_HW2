package kz.sultan;

public class App {
    public static void main(String[] args) {

        // 1 exercise
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println("Exercise 1 :" + java.util.Arrays.toString(arr));

        // 2 exercise
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println("Exercise 2: " + java.util.Arrays.toString(arr2));


        // 3 exercise
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println("Exercise 3: " + java.util.Arrays.toString(arr3));

        // 4 exercise
        int[][] array4 = new int[5][5];
        for(int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][array4.length - 1 - i] = 1;
        }
        System.out.println("Exercise 4: ");
        for(int i = 0; i < array4.length; i++) {
            System.out.println(java.util.Arrays.toString(array4[i]));
        }

        // 5 exercise
        int[] array5 = {4, 2, 7, 1, 9, 5};
        int min = array5[0];
        int max = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if(array5[i] < min)
                min = array5[i];
            if(array5[i] > max)
                max = array5[i];
        }
        System.out.println("Exercise 5: Min = " + min + ", Max = " + max);

        // 6 exercise
        int[] array6_1 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] array6_2 = {1, 1, 1, 2, 1};
        System.out.println("Exercise 6: " + checkBalance(array6_1));
        System.out.println("Exercise 6: " + checkBalance(array6_2));


        // 7 exercise
        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftArray(array7, 3);
        System.out.println("Exercise 7: " + java.util.Arrays.toString(array7));
    }

    // 6 method
    public static boolean checkBalance(int[] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }

    // 7 method
    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        n = n % length;
        if (n < 0) {
            n += length;
        }
        for (int i = 0; i < n; i++) {
            int temp = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }

}