package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;

        int size;

        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.err.print("The size is a integer number <= 20!\n");
                System.out.println();
            }
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println("Your Array: ");
        for (int o : array) {
            System.out.print(o + "\t");
        }

        int max = array[0];
        for (int o : array) {
            if (max < o) {
                max = o;
            }
        }

        System.out.println("\nMax value is: " + max);
    }
}
