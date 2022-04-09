package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Закончите предложение: семь раз отмерь, один раз...");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String True = "Семь раз отмерь, один раз отрежь";
        boolean TrueFalse = True.endsWith(str);

        if (TrueFalse) {
            System.out.println("Правильно");
        }

        else {
            System.out.println("Неправильно");
        }
    }}