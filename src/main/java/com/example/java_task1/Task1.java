package com.example.java_task1;

public class Task1 {

    public static void main(String[] args) {
        byte Byte1 = 127;
        byte Byte2 = 1;
        int Int1 = -2147483648;
        int Int2 = 2147483647;
        double D1 = 100.6;
        char C = 65535;
        float F1 = 12.3f;


        //переполнение
        System.out.println((byte) (Byte1+Byte2));
        System.out.println(Int1-Int2);
        System.out.println((char) (C+122));
        System.out.println(Double.MAX_VALUE/D1);




        //вычисления разных типов
        System.out.println(Byte1-D1);
        System.out.println(Int2/C);
        System.out.println(Int1 * F1);
        System.out.println(Long.MIN_VALUE + (Int2*D1));









    }
}
