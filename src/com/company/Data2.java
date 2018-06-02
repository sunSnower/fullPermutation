package com.company;

public class Data2 {
    Data2(){
        int count = 0;
        while(true){
            System.out.println((char)count++);
            if(count==100){
                break;
            }
        }
    }
}
