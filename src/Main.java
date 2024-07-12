import java.util.Scanner;

public class Main {
    public static final int NUM = 10;
    public static void main(String[] args) {

        String word = "Hello, World!";
        String myIndexName;

        myIndexName = NUM + " " + word;

        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);
        System.out.println("myVariableName: " + myIndexName);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");

        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}