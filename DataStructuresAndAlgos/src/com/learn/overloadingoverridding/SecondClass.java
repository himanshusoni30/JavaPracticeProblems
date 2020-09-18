package com.learn.overloadingoverridding;

public class SecondClass extends FirstClass
{
    public String Man(String name)
    {
        return name;
    }

    public double Man(double percentage)
    {
        return percentage;
    }

    public void Man(int age)
    {
        System.out.println("Age: "+40+" years");
    }

    public static void main(String[] arg)
    {
        SecondClass obj=new SecondClass();
        System.out.println("Name: "+obj.Man("Jacob"));
        System.out.println("Percentage: "+obj.Man(90.10));
        obj.Man(30);
    }
}


