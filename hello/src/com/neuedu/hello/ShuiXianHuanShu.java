package com.neuedu.hello;

public class ShuiXianHuanShu {
    public static void main(String[] args) {
        for ( int i = 100; i < 1000; i++) {
            int bai = i/100;
            int shi = i%100/10;
            int ge = i%10;
            double zong = Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3);
            int gong = (int)zong;
            if (gong == i) {
                System.out.println(i);
            }
        }
    }
}
