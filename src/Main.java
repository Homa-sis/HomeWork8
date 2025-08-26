import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
        // Task 1
        int[] arr = new int[]{1, 2, 3};
        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        int[] arr2 = {120, 125, 140, 135, 115};
        //Task 2
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr1[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr2[i]);
        }
        System.out.println("");

        System.out.println("Задача 3");

        int[] arr3 = new int[]{1, 2, 3};
        double[] arr4 = new double[]{1.57, 7.654, 9.986};
        int[] arr5 = {120, 125, 140, 135, 115};
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();
        for (int i = arr4.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr4[i] + ", ");
            } else {
                System.out.print(arr4[i]);
            }
        }
        System.out.println();
        for (int i = arr5.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr5[i] + ", ");
            } else {
                System.out.print(arr5[i]);
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 1;
            }
            System.out.println(arr[i]);
        }
    }
}