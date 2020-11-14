package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lIS(arr));
    }

    public static int lIS(int [] arr){
        if(arr.length == 0) return 0;
        int []dp = new int[arr.length];
        Arrays.fill(dp,1);
        int maxLength = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                maxLength = Math.max(maxLength,dp[i]);
            }
        }
        return maxLength;
    }
}
