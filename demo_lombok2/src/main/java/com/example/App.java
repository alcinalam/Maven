package com.example;

import java.time.LocalDate;


public class App 
{
    public static void main( String[] args ) {

        Staff t1 = Staff.builder() //
            .name("Vincent")//
            .joinDate(LocalDate.of(2013,4,30))//
            .build();

      

    }
    
        
        

    
}
