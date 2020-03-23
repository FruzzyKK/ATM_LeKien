package com.lekien;

import java.text.NumberFormat;
import java.util.Scanner;
public class Test1 {
        public static void main(String[] args) {


            Account checking = new Account();
            checking.setType("Kiểm tra");
            Account savings = new Account();
            savings.setType("Lưu");
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            Scanner sc = new Scanner(System.in);

            boolean session = true;

            while (session) {
                System.out.print("\nATM Menu: \n \n"
                        + "1. Gửi tiển  \n"
                        + "2. Rút Tiền \n"
                        + "3. Chuyển Tiền \n"
                        + "4. Kiểm tra số dư\n"
                        + "5. Kết thúc trương trình\n \n"
                        + "Chọn tác vụ  ");
                int selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        System.out.print("Nhập 1 : tài khoản chính hoặc 2 : Số tiết kiệm ");
                        int depAccount = sc.nextInt();
                        if (depAccount == 1) {
                            System.out.println("\nSố dư tài khoản hiện tại của bạn là " + formatter.format(savings.getBalance()) + "\n");
                            System.out.println("Bạn muốn gửi bao nhiêu tiền ?");
                            double deposit = sc.nextDouble();
                            savings.deposit(deposit);
                            System.out.println("\nSố dư tiết kiệm hiện tại của bạn là: " + formatter.format(savings.getBalance()) + "\n");
                        }
                        else if (depAccount == 2) {
                            System.out.println("\nSố dư sổ tiết kiệm hiện tại của bạn là: " + formatter.format(checking.getBalance()) + "\n");
                            System.out.println("Bạn muốn gửi bao nhiêu tiền?");
                            double deposit = sc.nextDouble();
                            checking.deposit(deposit);
                            System.out.println("\nSố dư  sổ tiết kiệm của bạn là  " + formatter.format(checking.getBalance()) + "\n");
                        }
                        break;
                    case 2:
                        System.out.print("\nNhập 1 : tài khoản chính hoặc 2 : Số tiết kiệm  ");
                        int witAccount = sc.nextInt();
                        if (witAccount == 1) {
                            System.out.println("\nSố dư tài khoản chính của bạn là: " + formatter.format(savings.getBalance()) + "\n");
                            System.out.println("Bạn muốn rút bao nhiêu tiền?");
                            double withdraw = sc.nextDouble();
                            savings.withdraw(withdraw);
                            System.out.println("\nYSố dư tài khoản chính của bạn là  : " + formatter.format(savings.getBalance()) + "\n");
                        }
                        else if (witAccount == 2) {
                            System.out.println("\nYSố dư sổ tiết kiệm của bạn là: " + formatter.format(checking.getBalance()) + "\n");
                            System.out.println("Bạn muốn rút bao nhiêu tiền? ");
                            double withdraw = sc.nextDouble();
                            checking.withdraw(withdraw);
                            System.out.println("\nYSố dư sổ tiết kiệm của bạn là: " + formatter.format(checking.getBalance()) + "\n");
                        }
                        break;
                    case 3:
                        System.out.print("\n:Nhập 1 : tài khoản chính hoặc 2 : Số tiết kiệm : ");
                        int tranAccount = sc.nextInt();
                        if (tranAccount == 1) {
                            System.out.println("\nSố dư tài khoản chính của bạn là: " + formatter.format(savings.getBalance()) + "\n");
                            System.out.print("Bạn muốn chuyển bao nhiêu tiền ? ");
                            double tranAmount = sc.nextDouble();
                            savings.withdraw(tranAmount);
                            checking.deposit(tranAmount);
                            System.out.println("\nBạn đã chuyển " + formatter.format(tranAmount));
                            System.out.println("\nkiểm tra số dư tk chính   : " + formatter.format(checking.getBalance()));
                            System.out.println("Số dư: " + formatter.format(savings.getBalance()) + "\n");
                        }
                        else if (tranAccount == 2) {
                            System.out.println("\nSố dư sổ tiết kiệm  của bạn là: " + formatter.format(checking.getBalance()) + "\n");
                            System.out.print("Bạn muốn chuyển bao nhiêu tiền ? ");
                            double tranAmount = sc.nextDouble();
                            checking.withdraw(tranAmount);
                            savings.deposit(tranAmount);
                            System.out.println("\nBạn đã chuyển" + formatter.format(tranAmount) );
                            System.out.println("\nKiemr tra số dư sổ : " + formatter.format(checking.getBalance()));
                            System.out.println("Số dư: " + formatter.format(savings.getBalance()) + "\n");
                        }
                        break;
                    case 4:
                        System.out.println("\ntài khoản tiết kiệm " + formatter.format(checking.getBalance()));
                        System.out.println("tài khoản chính: " + formatter.format(savings.getBalance()) + "\n");
                        break;
                    case 5:
                        session = false;
                        break;
                }
            }
            System.out.println("\ncảm ơn quý khách!\n");

        }

    }

