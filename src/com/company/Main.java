package com.company;
import resize.resizeable;

public class Main {

    public static void main(String[] args) {
	// write your code here
//       Shape[] shapes=new Shape[3];
//       shapes[0]=new Circle(2.0,"red",false);
//       shapes[1]=new Rectangle(1.0,2.0,"green",true);
//       shapes[2]=new Square(2.0,"yellow",true);
//
//        System.out.println("pre-resized");
//        for (Shape shape: shapes){
//            System.out.println(shape);
//
//        }


//        System.out.println("After-resized");
//        for (Shape shape: shapes){
//
//        }
Circle circle=new Circle(2,"red",false);
Rectangle rectangle=new Rectangle(1.0,2.0,"green",true);
Square square=new Square(2.0,"yellow",true);
        System.out.println("pre-resized");
        System.out.println(circle+"\n"+rectangle+"\n"+square);
     circle.resize(5);
     rectangle.resize(8);
     square.resize(7);
        System.out.println("after-resized");
        System.out.println(circle+"\n"+rectangle+"\n"+square);
    }
}
