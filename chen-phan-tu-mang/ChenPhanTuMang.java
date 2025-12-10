import java.util.Scanner;

public class ChenPhanTuMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Khai báo mảng N phần tử (cho trước)
        System.out.print("Nhap so luong phan tu N: ");
        int N = input.nextInt();

        int[] arr = new int[N];
        int n = arr.length;

        // Nhập các phần tử vào mảng
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhap gia tri X can chen: ");
        int X = input.nextInt();

        // Bước 3: Nhập vị trí cần chèn
        System.out.print("Nhap vi tri index can chen: ");
        int index = input.nextInt();

        // Bước 4: Kiểm tra vị trí
        if (index < 0 || index > n - 1) {
            System.out.println("Khong chen duoc phan tu vao mang!");
        } else {
            // Bước 5: Dịch các phần tử sang phải
            for (int i = n - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
        }

        // Bước 6: In mảng
        System.out.println("Mang sau khi chen:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
