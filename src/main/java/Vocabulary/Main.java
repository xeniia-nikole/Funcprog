package Vocabulary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу на аборигенском:");
        String msg = scanner.nextLine();

        System.out.println("Ведите пояснения:");
        String yourWords = scanner.nextLine();

        // детерминированность
        Function<String, String[]> splitWords = string -> string.split("\\s");

        System.out.println("\nВаш словарь для общения с аборигенами:");

        // Монада
        Arrays.stream((splitWords.apply(msg + yourWords)))
                .sorted()
                .map(w -> w + " - значение этого слова пока неизвестно!")
                .forEach(System.out::println);

    }


}
