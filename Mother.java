package ru.innopolis.university.mingaleev.homework_3_13;

import java.util.Arrays;
import java.util.Scanner;

public class Mother {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Чем накормим ребенка?\n Чтобы перестать кормить наберите \"quit\"");
            System.out.print("Ребенок любит: " + Arrays.toString(Food.values()));
            String feedFood = in.nextLine();

            if ("quit".equals(feedFood)) {
                System.out.println("STOP Feeding");
                break;
            }
            try {
                Сhildren.eat(feedFood);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Спасибо, мама!\n");
            }
        } while (true);

    }
}
