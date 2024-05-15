package com.example;

import com.example.Square.SquareBuilder;

public class App {

    public static void main(String[] args) {
        
        
        Square s = Square.builder()//
        .length(23)
        .build();
        s.print();
        
        Circle c = new Circle(10.0);
        c.print();

    }
}
