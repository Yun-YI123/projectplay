package com.amy;

import java.util.Scanner;

public class PlayCard {
    public static void main(String[] args) {
        int point = 0;
        while(point <= 99){
            System.out.println("Point:"+point+" ,Please play your card: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if(s.equals("k")){
                point = 99;
            }else if(s.equals("q")){
                if(point <= 79){
                    point += 20;
                }else if(point > 79){
                    point -= 20;
                }
            }
            else{
                int n = Integer.parseInt(s);
                point = point +n;
            }
        }
        System.out.println("You loose!!");
    }
}
