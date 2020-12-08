package com.amy;

import java.util.Random;

public class Game_AB_2 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        for(int i = 0; i<10; i++){
            nums[i]=i;
        }
        for(int i=0; i<10; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        Random random = new Random();

        for (int i=0; i<20; i++){
            int r = random.nextInt(10);
            int m = i%10;
            int tmp = nums[m];
            nums[m] = nums[r];
            nums[r] = tmp;
        }
        for(int i=0; i<10; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
