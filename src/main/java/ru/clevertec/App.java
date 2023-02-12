package ru.clevertec;


import ru.clevertec.utils.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value: ");
        System.out.println(StringUtils.isPositiveNumber(in.nextLine())?"Positive":"Negative");
    }
}
