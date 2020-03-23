package com.lekien;

import java.util.Scanner;

public class Service {

    public static boolean login(Account acc){

        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số tài khoản:");
        String accNo = sc.nextLine();
        System.out.print("nhập mật khẩu:");
        String pass = sc.next();
        return acc.getUserName()==accNo && acc.getPassWord().equals(pass);
    }
}
