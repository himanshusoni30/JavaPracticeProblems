package com.learn.interfaces;

public class UseInterface implements FirstInterface, SecondInterface
{
    @Override
    public void name(String name) {
        System.out.println("Name: "+name);
    }

    @Override
    public void Car() {
        System.out.println("Car: Skoda");
    }

    String city="Melbourne";
    int age=40;
    int height=171;

    public static void main(String[] arg)
    {
        StringBuffer str=new StringBuffer();
        str.toString();
        UseInterface obj = new UseInterface();
        obj.name("Malcom");
        System.out.println("Age: "+obj.age+", Height: "+obj.height);
        System.out.println("Hobby: "+obj.hobbies());
        obj.Car();
        System.out.println("City: "+obj.city);
        System.out.println("Country: "+obj.Country());
    }
}
