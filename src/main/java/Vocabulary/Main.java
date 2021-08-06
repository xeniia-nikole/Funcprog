package Vocabulary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу на аборигенском:");
        String msg = scanner.nextLine();

        Function<String, String[]> stringToArray = s -> Arrays.stream(s.split("\\s+")).distinct().sorted().toArray(String[]::new);
        String[] array = stringToArray.apply(msg);
        System.out.println("Ваш словарь для общения с аборигенами:");
        for (String s : array) {
            System.out.println(s);
        }


    }
}

