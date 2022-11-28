package Drinks;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Drinks {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            out.println("***********************************************");
            out.println("Автомат для напитков имеет следующие напитки:");
            out.println("COFFEE стоит -    4.95 $");
            out.println("TEA стоит -       3.40 $");
            out.println("LEMONADE стоит -  2.99 $");
            out.println("MOJITO стоит -    8.50 $");
            out.println("WATER стоит -     4.30 $");
            out.println("COCA_COLA стоит - 6.75 $");
            out.println("***********************************************");
            String drinksChoice = "";
            while (!isContain(drinksChoice)) {
                out.print("Впишите литерами какой напиток вы желаете: ");
                drinksChoice = scanner.next().toUpperCase();
            }
            DrinksMachine drinksMachine = DrinksMachine.valueOf(drinksChoice);
            switch (drinksMachine) {
                case COFFEE:

                    System.out.print("Вы выбрали кофе!");
                    break;
                case TEA:
                    out.print("Вы выбрали чай!");
                    break;
                case LEMONADE:
                    out.print("Вы выбрали лимонад!");
                    break;
                case MOJITO:
                    out.print("Вы выбрали мохито!");
                    break;
                case WATER:
                    out.print("Вы выбрали воду!");
                    break;
                case COCA_COLA:
                    out.print("Вы выбрали кока-колу!");
                    break;
                default:
                    out.print("Такого напитка нет в наличие!");
                    break;
            }

        }

        private static boolean isContain(String s) {
            for (DrinksMachine val : DrinksMachine.values()) {
                if (val.name().equals(s)) return true;
            }
            return false;
        }
    }