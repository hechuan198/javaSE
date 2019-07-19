package com.neuedu.hello;



import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * 搜索 二分法
 * 通过不停的找中间值，来找到指定值，输出他排序后的位置。
 *  前提是要有序
 */
public class SouSuo {
    public static void main(String[] args) {
        int[] arr = {123,43,543,5643,654,34,576,2,4235,55,532};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入想要查询的数字：");
        int i = scanner.nextInt();

        erFen(arr,i);
    }
    public static void erFen(int[] arr,int i){
        sort(arr);
        int left = 0;
        int right = arr.length- 1;
        int middle = (left + right)/2;
        while (true){
            if (arr[middle] == i) {

                break;
            }else if (arr[middle] < i) {
                left = middle;
                middle = (right + left) / 2;
            }else{
                right = middle;
                middle = (right + left)/2;
            }

        }
        System.out.println(middle+1);

    }
}
