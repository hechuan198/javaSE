package com.neuedu.hello;

public class FeiBoNaQieShuLei {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x);
        System.out.println(y);

        for (;;) {
            if (x+y <= 1000) {
                int z = x + y;
                System.out.println(z);
                x = y;
                y = z;
            }
            else {
                break;
            }

            
        }
    }




}
