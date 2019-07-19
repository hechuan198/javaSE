package com.neuedu.hello;

import java.util.Scanner;

public class JiTuTongLong {
    public static void main(String[] args) {
        while (true) {
            System.out.print("请输入头的个数：");
            Scanner scanner  = new Scanner(System.in);
            int head = scanner.nextInt();
            System.out.print("请输入脚的个数:");
            int foot = scanner.nextInt();
            int j = (foot - 2*head)/2;
            int t = head - j;
            if (j + t == head && j*4 + t*2 == foot && j >= 0 && t >=0) {
                System.out.println("鸡"+j+"只，兔"+t+"只");
                break;
            }else{
                System.out.println("输入有误！！！！！！！！");
            }
        }
    }

}
