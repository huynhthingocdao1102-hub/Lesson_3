import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Khai báo mảng
        int[] arr = {1, 4, 7, 9, 7, 10, 15};
        int n = arr.length;

        // In mảng ban đầu
        System.out.println("Mang ban dau:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Bước 2: Nhập phần tử cần xoá
        System.out.print("\nNhap phan tu can xoa: ");
        int X = input.nextInt();

        // Bước 3: Tìm vị trí xuất hiện
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == X) {
                index_del = i; // lưu vị trí tìm được
                break;
            }
        }
        // Kiểm tra kết quả tìm kiếm
        if (index_del == -1) {
            System.out.println("Phan tu khong ton tai trong mang!");
        } else {
            // Bước 4: Xoá phần tử
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // giảm kích thước mảng

            // Bước 5: In ra mảng sau khi xoá
            System.out.println("Mang sau khi xoa:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
