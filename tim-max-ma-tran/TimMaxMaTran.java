import java.util.Scanner;

public class TimMaxMaTran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 2: Nhập ma trận từ bàn phím
        System.out.print("Nhap so dong: ");
        int rows = input.nextInt();
        System.out.print("Nhap so cot: ");
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // In kết quả
        System.out.println("Gia tri lon nhat trong ma tran la: " + maxValue);
        System.out.println("Toa do: [" + maxRow + "][" + maxCol + "]");
    }
}
