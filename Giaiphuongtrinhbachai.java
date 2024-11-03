package giaiphuongtrinhbachai;

import java.util.Scanner;

public class Giaiphuongtrinhbachai {
    // Ham giai phuong trinh bac hai
    public static String giaiPhuongTrinh(double a, double b, double c) {
        // Kiem tra neu a = 0 thi phuong trinh tro thanh bac nhat
        if (a == 0) {
            // Neu a = 0 va b = 0
            if (b == 0) {
                if (c == 0) {
                    // Neu ca a, b, c deu bang 0, phuong trinh co vo so nghiem
                    return "Phuong trinh co vo so nghiem.";
                } else {
                    // Neu a = 0, b = 0 nhung c khac 0, phuong trinh vo nghiem
                    return "Phuong trinh vo nghiem.";
                }
            } else {
                // Neu a = 0 va b khac 0, phuong trinh tro thanh bac nhat: bx + c = 0
                double x = -c / b;
                return "Phuong trinh co nghiem bac nhat x = " + x;
            }
        } else {
            // Tinh delta (b^2 - 4ac) de xac dinh nghiem cua phuong trinh bac hai
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                // Neu delta < 0, phuong trinh vo nghiem
                return "Phuong trinh vo nghiem.";
            } else if (delta == 0) {
                // Neu delta = 0, phuong trinh co nghiem kep x = -b / (2a)
                double x = -b / (2 * a);
                return "Phuong trinh co nghiem kep x = " + x;
            } else {
                // Neu delta > 0, phuong trinh co hai nghiem phan biet x1 va x2
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phuong trinh co hai nghiem phan biet x1 = " + x1 + ", x2 = " + x2;
            }
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
        
        // Nhap he so c
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        // Goi ham giai phuong trinh va in ket qua
        String ketQua = giaiPhuongTrinh(a, b, c);
        System.out.println(ketQua);
        
        // Dong scanner
        scanner.close();
    }
}
