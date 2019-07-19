package com.neuedu.hello;

import java.util.Arrays;
import java.util.Scanner;

public class BankManagement {
        static int money = 10000;
        static int money2 = 10000;
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        bankManage();
    }
    static void bankManage(){
        while(true) {
            System.out.println("**********");
            System.out.println("1.查询余额");
            System.out.println("2.取款");
            System.out.println("3.存款");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.print("请选择需要查询业务的编号:");
            int index = scanner.nextInt();
            switch (index){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    quKuan();
                    break;
                case 3:
                    cunKuan();
                    break;
                case 4:

                    break;
                case 5:
                    return;
                default:
                    System.out.println("没有此项！！！！！！！");

            }
        }
    }
    static void lookMoney(){
        System.out.println(money);
        System.out.println(money2);
    }
    static void quKuan(){
        System.out.print("想要取出的金额：");
        int i = scanner.nextInt();
        money -= i;
        System.out.println("成功");
    }
    static void cunKuan(){
        System.out.print("想要存的金额：");
        int i = scanner.nextInt();
        money += i;
        System.out.println("成功");
    }
    static void zhuanZhang(){
        System.out.print("请输入转账金额：");
    }


}
