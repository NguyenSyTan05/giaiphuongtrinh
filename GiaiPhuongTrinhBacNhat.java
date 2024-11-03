package giaiphuongtrinhbacnhat;
import java.util.Scanner;


public class GiaiPhuongTrinhBacNhat {
    // Ham giai phuong trinh bac nhat
    public static String giaiPhuongTrinh(double a, double b) {
        // Kiem tra neu a = 0
        if (a == 0) {
            // Neu ca a va b deu bang 0, phuong trinh co vo so nghiem
            if (b == 0) {
                return "Phuong trinh co vo so nghiem.";
            } else {
                // Neu a = 0 nhung b khac 0, phuong trinh vo nghiem
                return "Phuong trinh vo nghiem.";
            }
        } else {
            // Neu a khac 0, phuong trinh co nghiem duy nhat x = -b / a
            double x = -b / a;
            return "Phuong trinh co nghiem x = " + x;
        }
    }

    // Phuong thuc main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap he so a
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        // Nhap he so b
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        // Goi ham giai phuong trinh va in ket qua
        String ketQua = giaiPhuongTrinh(a, b);
        System.out.println(ketQua);

        // Dong scanner
        scanner.close();
    }
}
