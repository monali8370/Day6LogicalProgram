package com.logical;//5. Write a static function sqrt to compute the square root of a nonnegative number c
//        given in the input using Newton's method:
//        - initialize t = c
//        - replace t with the average of c/t and t
//        - repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
//        where epsilon = 1e-15;
import java.util.*;
public class SqrtNewtonMethod
{
    public static double sqrt(double root)
    {
        double t=root;
        if(root<0)
            System.out.println("Please enter Non-Negitive Number: ");
        else
        {
            double epsilon = 1e-15;
            while(Math.abs(t-root/t)>epsilon*t)
                t=(root/t+t)/2.0;
        }
        return t;
    }
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        SqrtNewtonMethod ob=new SqrtNewtonMethod();
        System.out.println("Enter the Number: ");
        double root=rs.nextDouble();
        System.out.println(ob.sqrt(root));
    }
}
