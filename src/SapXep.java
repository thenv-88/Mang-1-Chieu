/*
    - Khởi tạo mảng một chiều nguyên.
    - Sắp xếp các phần tử của mảng theo thứ tự tăng dần.
    - Sắp xếp các phần tử của mảng theo thứ tự giảm dần.
    - Tìm kiếm phần tử của mảng.
 */
import java.util.Scanner;

public class SapXep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[] {2, -1, 3, -7, 8, 12, 9, -6, 10, 100, 123, -4, -12, 7};
        int index;
        int dem = 0;
        int temp = arr[0];

        // Sắp xếp các phần tử của mảng theo thứ tự tăng dần.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp tăng dần.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        // Sắp xếp các phần tử của mảng theo thứ tự giảm dần.
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp giảm dần");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        // Tìm kiếm phần tử của mảng.
        System.out.println("\n");
        System.out.print("Nhập phần tử index = ");
        index = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i])
                dem++;
        }

        if (dem == 0)
            System.out.println("Không tìm thấy phần tử index = " + index + " trong mảng arr");
        else
            System.out.println("Tìm thấy phẩn tử index = " + index + " trong mảng arr");
    }
}
