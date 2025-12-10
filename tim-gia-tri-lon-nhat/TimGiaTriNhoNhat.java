import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Khai báo mảng
        System.out.print("Nhap so phan tu cua mang: ");
        int SIZE = input.nextInt();
        int[] arr = new int[SIZE];

        // Bước 2: Nhập giá trị cho mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên là nhỏ nhất
        int min = arr[0];

        // Bước 4: Duyệt từ phần tử thứ 2 (index = 1)
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
