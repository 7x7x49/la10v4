package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите предложение/слово");

        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        System.out.println("Введите подстроку");
        String word = in.nextLine();

        boolean TrueFalse = sentence.endsWith(word);

        if (TrueFalse){
            System.out.println("Введённая подстрока является концом предложения/слова");
        }

        else{
            System.out.println("Введённая подстрока не является концом предложения/слова");
        }
    }}
