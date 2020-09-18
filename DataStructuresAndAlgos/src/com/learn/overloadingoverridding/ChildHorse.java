package com.learn.overloadingoverridding;

public class ChildHorse extends ParentAnimal
{
    public void eat()
    {
        System.out.println("Horse eating hay.");
    }

    public void eat(String s)
    {
        System.out.println("Horse eating "+s);
    }

//    public staticpack void main(String[] args)
    static public void main(String[] a)
    {
        ParentAnimal pa=new ParentAnimal();
        pa.eat();
//        pa.eat("Hay"); //Compiler error! Compiler sees that ParentAnimal class doesn't have an eat() method that takes a String.

        ChildHorse ch=new ChildHorse();
        ch.eat();
        ch.eat("Grams");

        ParentAnimal pan=new ChildHorse();
        pan.eat();
//        pan.eat("Hay"); //Compiler error! Compiler still looks only at the reference, and sees
//that ParentAnimal doesn’t have an eat() method that takes a String.
//Compiler doesn’t care that the actual object might be a ChildHorse at
//runtime.
    }
}
