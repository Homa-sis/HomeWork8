import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");

        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {120, 125, 140, 135, 115};
        System.out.println(Arrays.toString(arr2));

        System.out.println("Задача 3");
        int[] arr3 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(arr3));
        double[] arr4 = new double[]{9.986, 7.654, 1.57};
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = {115, 135, 140, 125, 120};
        System.out.println(Arrays.toString(arr5));

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] % 2 == 1) {
                arr[i] += 1;
            }
            System.out.println(arr[i]);



        }
    }
}