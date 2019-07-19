package com.neuedu.hello;

import java.text.CharacterIterator;

public class sanjiaoxing {
    public static void main(String[] args) {
        /*for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        /*for (int i = 0; i < 5; i++) {
            for (int n = 0; n < 5 - i; n++) {

                    System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

/*

         for (int i = 5; i > 0; i--) {
            for (int n = 0; n < 5 - i; n++) {

                    System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*

        for (int i = 0; i < 5; i++) {
            for (int n = 0; n < 5 - i; n++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


        for (int i = 97; i < 148; i++) {
              if (i < 123) {
                  System.out.print((char) i);
              } else{
                  System.out.print((char)(0xf4 - i) );
              }

        }


/*

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
*/

/*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 4) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


/*        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 2 && j - i <= 2) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

  /*      for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 2 && i - j <= 2 && i + j <= 6 && j - i <= 2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

    }
}
