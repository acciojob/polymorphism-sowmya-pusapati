package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
      int a=  p.product(3,4);
      int b=  p.product(3,4,5);
       double d= p.product(3.45,5.6);
       System.out.println(a);
        System.out.println(b);
        System.out.println(d);

    }

}
class Product{


    public int product(int x, int y){
        return x*y;
    }
    public int product(int x,int y,int z){
        return (int)x*y*z;
    }
    public double product(double x,double y){
        return x*y;
    }

}