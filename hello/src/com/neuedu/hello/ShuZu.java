package com.neuedu.hello;

import java.util.Random;

public class ShuZu {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
        int suiji = r.nextInt(100);
        arr[i] = suiji;
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int max = arr[0];


        System.out.println("最大值为："+max);
        int min = arr[0];
        double zong = 0;
        double pingjun = 0;
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]){
                max = arr[j];
            }

            if (min > arr[j]){
                min = arr[j];
            }

            zong += arr[j];


        }
        pingjun = zong/arr.length;
        System.out.println("最小值为："+min);
        System.out.println("总和为："+zong);
        System.out.println("平均值为："+pingjun);

    }
}
