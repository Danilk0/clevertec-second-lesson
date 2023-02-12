package ru.clevertec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Click ENTER, that stop input");
        List<String> list=new ArrayList<>();
        while (true){
            System.out.println("Input value: ");
            String s = in.nextLine();
            if(s.isEmpty())
                break;
            list.add(s);
        }

        System.out.println(Utils.isAllPositiveNumbers(list.toArray(String[]::new))?"All positive":"Something negative");
    }
}