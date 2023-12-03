package com.logical;
//6. Write a static function toBinary that outputs the binary (base 2) representation of
//        the decimal number typed as the input. It is based on decomposing the number into
//        a sum of powers of 2. For example, the binary representation of 106 is 11010102,
//        which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
//        to represent 4 Byte String.
//        To compute the binary representation of n, we consider the powers of 2 less than or
//        equal to n in decreasing order to determine which belong in the binary
//        decomposition (and therefore correspond to a 1 bit in the binary representation).
import java.util.*;
public class ToBinary
{
    public static int toBinary(int decimal)
    {
        int binary= Integer.parseInt(Integer.toBinaryString(decimal));
        return binary;
    }
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        ToBinary ob=new ToBinary();
        System.out.println("Enter the Number for Conversion: ");
        int decimal=rs.nextInt();
        System.out.println(ob.toBinary(decimal));
    }
}
