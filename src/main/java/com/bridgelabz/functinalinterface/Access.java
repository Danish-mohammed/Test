package com.bridgelabz.functinalinterface;

public class Access {
    //Default
    //Public
    //Private
    //Protected

    public Access(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int a;
    public int b;
    private int c=20;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

class Demo
{
    public static void main(String[] args) {
        Access abc = new Access(10,5);
        abc.setC(10);
        System.out.println(abc.getC());
    }


}

