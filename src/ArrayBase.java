/*
    - Nhập các phần tử của mảng một chiều nguyên.
    - In ra các phần tử mảng vừa nhập.
    - Tìm các số nguyên tố trong mảng và in ra.
    - Tìm các số chính phương trong mảng và in ra.
    - Tìm các số hoàn chỉnh trong mảng và in ra.
*/
import java.util.Scanner;

public class ArrayBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        System.out.print("Nhập chỉ số mảng index = ");
        index = input.nextInt();
        int[] arra = new int[index];

        // Nhập các phần tử của mảng arra.
        for (int i = 0; i < arra.length; i++) {
            System.out.print("arra[" + i + "] = ");
            arra[i] = input.nextInt();
        }

        // In các phần tử của mảng arra.
        System.out.println("\n Các phần tử của mảng là:");
        for (int i = 0; i < arra.length; i++) {
            System.out.print("\t" + arra[i]);
        }

        // Tìm và in ra các số nguyên tố có trong mảng arra.
        System.out.println("\n");
        for (int i = 0; i < arra.length; i++) {
            int dem = 0;
            if (arra[i] >= 2) {
                for (int j = 1; j <= (int) Math.sqrt(arra[i]); j++) {
                    if (arra[i] % j == 0)
                        dem++;
                }
                if (dem == 1) {
                    System.out.println(arra[i] + ": là số nguyên tố");
                }
            }
        }

        // Tìm các số chính phương trong mảng và in ra.
        System.out.println("\n");
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] >= 1) {
                int m = (int) Math.sqrt(arra[i]);
                if (arra[i] == m * m)
                    System.out.println(arra[i] + " là số chính phương");
            }
        }

        // Tìm và in các số hoàn chỉnh trong mảng.
        System.out.println("\n");
        for (int i = 0; i < arra.length; i++) {
            int S = 1;
            if (arra[i] > 1) {
                for (int j = 2; j <= (int) arra[i] / 2; j++) {
                    if (arra[i] % j == 0) {
                        S = S + arra[i] / j;
                    }
                }
                if (S == arra[i])
                    System.out.println(arra[i] + " là số hoàn chỉnh");
            }
        }
    }
}
