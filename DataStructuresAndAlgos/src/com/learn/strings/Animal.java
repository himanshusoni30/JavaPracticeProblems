package com.learn.strings;

class Animal
{
    public Animal(String name, String type)
    {
        this.name=name;
        this.type=type;

    }

    String name;
    String type;

    public String toString()
    {
        StringBuffer str=new StringBuffer();
        str.append('<');
        str.append(this.name);
        str.append('>');
        return str.toString();
//        return "Animal name: "+name+", Animal type: "+type;
    }
}
