import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("имя первого героя:");
        String name1 = scanner.nextLine();

        System.out.println("вид для первого героя:");
        System.out.println("1. Драконорожденный");
        System.out.println("2. Нежить");
        System.out.println("3. Фей");
        System.out.println("4. Гном");
        System.out.println("5. Вампир");
        System.out.println("6. Тролль");
        System.out.println("7. Кентавр");
        System.out.println("8. Минотавр");
        int choice1 = scanner.nextInt();
        scanner.nextLine();

        int health1 = HP(choice1);
        int attack1 = damage(choice1);

        System.out.println("имя второго героя:");
        String name2 = scanner.nextLine();

        System.out.println("вид для второго героя:");
        System.out.println("1. Драконорожденный");
        System.out.println("2. Нежить");
        System.out.println("3. Фей");
        System.out.println("4. Гном");
        System.out.println("5. Вампир");
        System.out.println("6. Тролль");
        System.out.println("7. Кентавр");
        System.out.println("8. Минотавр");
        int choice2 = scanner.nextInt();
        scanner.nextLine();

        int health2 = HP(choice2);
        int attack2 = damage(choice2);

        System.out.println("\nВаша команда:");
        System.out.printf("%s - хп: %d, дамаг: %d%n", name1, health1, attack1);
        System.out.printf("%s - хп: %d, дамаг: %d%n", name2, health2, attack2);

        battle(name1, health1, attack1, name2, health2, attack2, random);
    }

    private static int HP(int choice) {
        switch (choice) {
            case 1:
                return 150;
            case 2:
                return 120;
            case 3:
                return 90;
            case 4:
                return 110;
            case 5:
                return 100;
            case 6:
                return 180;
            case 7:
                return 130;
            case 8:
                return 140;
            default:
                return 100;
        }
    }

    private static int damage(int choice) {
        switch (choice) {
            case 1:
                return 18;
            case 2:
                return 12;
            case 3:
                return 22;
            case 4:
                return 15;
            case 5:
                return 20;
            case 6:
                return 10;
            case 7:
                return 16;
            case 8:
                return 14;
            default:
                return 15;
        }
    }

    private static void battle(String name1, int health1, int attack1, String name2, int health2, int attack2, Random random) {
        System.out.println("\nСхватка между " + name1 + " и " + name2 + " началась!");
        while (health1 > 0 && health2 > 0) {
            if (random.nextBoolean()) {
                health2 -= attack1;
                System.out.printf("%s наносит удар %s на %d дамага%n", name1, name2, attack1);
                System.out.printf("%s осталось %d  хп%n", name2, health2);
            } else {
                health1 -= attack2;
                System.out.printf("%s наносит удар %s на %d дамага%n", name2, name1, attack2);
                System.out.printf("%s осталось %d хп%n", name1, health1);
            }
        }

        if (health1 > 0) {
            System.out.println(name1 + " одержал(а) победу!");
        } else {
            System.out.println(name2 + " одержал(а) победу!");
        }
    }
}
