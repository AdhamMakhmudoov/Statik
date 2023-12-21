package com.company;

public class MathFunksion {

    static int q;
    static double E;
    static float PI;

    static {
        E = 2.71f;
        PI = 3.14f;
    }
    static void doiraYuzi(int radius){
        System.out.println(Math.pow(E,radius));
    }
    static void geron(int a,int b,int c) {
        q = (a + b + c) / 2;
        System.out.println(Math.sqrt(q * ((q - a) * (q - b) * (q - c))));
    }
}
