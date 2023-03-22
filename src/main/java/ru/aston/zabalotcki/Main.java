package ru.aston.zabalotcki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputName = new Scanner(System.in);

        System.out.println(greetings(inputNumber));
        System.out.println(greetingsVyacheslav(inputName));
        arrayReader(inputNumber);

        inputName.close();
        inputNumber.close();

        /*
        Дана скобочная последовательность: [((())()(())]]
        - Можно ли считать эту последовательность правильной?
        - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

        Ответ: нет, должна быть [((())()(()))]
        * */
    }

    private static String greetingsVyacheslav(Scanner scanner){
        System.out.println("Введите имя: ");
        return  Greetings.grittingVyacheslav(scanner.nextLine());
    }

    private static String greetings(Scanner scanner){
        System.out.println("Введите число: ");
        return  Greetings.gritting(scanner.nextInt());
    }

    private static void arrayReader(Scanner scanner){
        System.out.print("Введите размер массива ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите элементы массива : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayReader.arrayReader(arr);
    }
}
