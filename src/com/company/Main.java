package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Data data = new Data(in);
        data.print(0);
        Data1 data1 = new Data1();
        Data2 data2 = new Data2();
    }
}
