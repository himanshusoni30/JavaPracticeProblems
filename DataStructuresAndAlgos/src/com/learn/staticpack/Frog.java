package com.learn.staticpack;

public class Frog {
    static int frogCount=0;

    public Frog()
    {
        frogCount += 1;
    }

    public static void makeNoise()
    {
        System.out.println("TurrTurr");
    }
}
