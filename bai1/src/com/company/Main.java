package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");
        String dateOfBirth = scanner.nextLine();
        LocalDate lcd = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String time1 = scanner.nextLine();
        LocalDateTime lcdt = LocalDateTime.parse(time1, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss)");
        String time2 = scanner.nextLine();
        LocalTime lct = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH:mm:ss"));


        System.out.println("Tên hàng nhập kho là: "+name);
        System.out.println("Ngày tháng năm sinh của bạn là: "+lcd);
        System.out.println("Thời gian bạn nhập hàng là: "+lcdt);
        System.out.println("Thời gian của bạn: "+lct);

    }
}
