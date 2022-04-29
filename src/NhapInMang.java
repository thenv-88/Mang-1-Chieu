/*Nhập và in các phần tử của mảng nguyên*/

import java.util.Scanner;

public class NhapInMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        System.out.print("Nhap index = ");
        index = input.nextInt();
        int[] nums = new int[index];

        // Nhập các phần tử của mảng nums.
        System.out.println("Nhập các phần tử của mảng nums:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("nums[" + i + "] = ");
            nums[i] = input.nextInt();
        }

        // In các phần tử của mảng nums
        System.out.println("Các phần tử của mảng nums: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "]= " + nums[i]);
        }

    }
}
