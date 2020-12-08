package com.amy;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coin = 1;
        int total = 0;
        while (coin != 0) {
            System.out.println("put coins(1,5,10) or buy drinks(a,b,c):");
            String s = scanner.next();
            if (s.equals("a")) {
                if(total > 15) {
                    System.out.println("Don!");
                    total = total - 15;
                    System.out.println("Total:"+total);
                }else{
                    System.out.println("Beep~");
                    System.out.println("Total:"+total);
                }
            } else if (s.equals("b")) {
                if(total > 29) {
                    System.out.println("Don!");
                    total = total - 29;
                    System.out.println("Total:"+total);
                }else{
                    System.out.println("Beep~");
                    System.out.println("Total:"+total);
                }
            } else if (s.equals("c")) {
                if(total > 40) {
                    System.out.println("Don!");
                    total = total - 40;
                    System.out.println("Total:"+total);
                }else{
                    System.out.println("Beep~");
                    System.out.println("Total:"+total);
                }
            }else {
                coin =Integer.parseInt(s);
                total = total + coin;
                System.out.println("Total:" + total);
            }
        }
    }
}
