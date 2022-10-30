package trtr;

import java.util.Scanner;

public class Game {
    public static class GuessTheNumber {
        public static void main(String[] args) {
            int UnknownNumber, PlayerNumber, TrysCount = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("ЗАДАЧА: Угадать число (от 0 до 10).");
            UnknownNumber = (int) Math.floor(Math.random() * 10);
            do {
                TrysCount++;
                System.out.print("Введите ваше число: ");
                PlayerNumber = input.nextInt();
                if (PlayerNumber > UnknownNumber)
                    System.out.println("Моё число меньше.");
                else if (PlayerNumber < UnknownNumber) System.out.println("Моё число больше.");
                else System.out.println("Вы угадали!");
            } while (PlayerNumber != UnknownNumber);
            System.out.println("Количество попыток: " + TrysCount);
        }
    }
}