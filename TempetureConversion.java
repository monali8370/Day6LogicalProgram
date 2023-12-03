package com.logical;
import java.util.*;
public class TempetureConversion {
    public static void main(String[] args) {
        System.out.println("choose one case\n 1.enter the fahreheit\n2.enter the cohension");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("enter the Fahrenheit");
                int F=sc.nextInt();
                int C=(F-32) *5/9;
                System.out.println("celsius temperature is"+C);
                break;
            case 2:
                System.out.println("enter the cohension");
                C=sc.nextInt();
                F=(C*9/5) + 32;
                System.out.println("Fahrenheit temperature is"+F);
                break;
            default:
                System.out.println("choose valid temperature");


        }
    }
}