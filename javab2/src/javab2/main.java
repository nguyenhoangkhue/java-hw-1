package javab2;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("ten da nhap la:" + name);

        System.out.println("Nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("tuoi da nhap la:" + age);

        scanner.nextLine();

    }
}
