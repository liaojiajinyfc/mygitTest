package com.itheima.pojo;

public class Person {
    private int a;
    private int b;
    private int c;
    private int d;

    public Person(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
    public void hello(){
        System.out.println("你好");
    }
    public void say(){
        System.out.println("你好，最近在忙什么");
    }

    public void show(){
        System.out.println("工作可好");
    }
    public void en(){
        System.out.println("还好啦。");
    }

}
