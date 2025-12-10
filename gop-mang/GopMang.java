import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng với kích thước cho trước
        System.out.print("Nhap so phan tu mang 1: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Nhap so phan tu mang 2: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        // Bước 2: Nhập giá trị cho các phần tử mảng 1
        System.out.println("Nhap gia tri cho mang 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = input.nextInt();
        }
        // Nhập giá trị cho các phần tử mảng 2
        System.out.println("Nhap gia tri cho mang 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = input.nextInt();
        }
        // Bước 3: Tạo mảng 3 có kích thước n1 + n2
        int[] arr3 = new int[n1 + n2];
        // Bước 4: Gán phần tử mảng 1 vào mảng 3
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        // Bước 5: Gán phần tử mảng 2 vào mảng 3
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }
        // In mảng 3
        System.out.println("Mang sau khi gop:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
