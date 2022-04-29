/*
    - Nhập các phần tử của mảng nguyên.
    - In ra phần tử mảng lớn nhất.
    - In ra phần tử mảng nhỏ nhất.
*/
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        System.out.print("Nhập index = ");
        index = input.nextInt();
        int[] array = new int[index];

        // Nhập các phần tử của mảng array.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập các phần tử của mảng array:");
            System.out.print("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        // Tìm các phần tử lớn nhất của mảng array.
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Phần tử lớn nhất của mảng array: " + max);

        // Tìm phần tử nhỏ nhất của mảng array.
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Phần tử nhỏ nhất của mảng array: " + min);
    }
}

