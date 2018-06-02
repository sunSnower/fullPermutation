package com.company;

import java.util.Scanner;

public class Data {
    Scanner in;
    char[] arr;
    char[] newArr;

    Data(Scanner in){
        this.in = in;
        arr = in.nextLine().toCharArray();
        newArr = new char[arr.length];
    }
    void print(int k){
        if(k>=arr.length){
            System.out.println(new String(newArr));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            newArr[k] = arr[i];
            k++;
            print(k);
            k--;
        }
    }
}
