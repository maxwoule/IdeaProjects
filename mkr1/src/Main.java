import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введіть рядки тексту (натисніть Enter після кожного рядка, для завершення введіть 'end'):");

        // Зчитування рядків тексту введених користувачем
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            strings.add(input);
            input = scanner.nextLine();
        }

        System.out.println("Рядки, які починаються з літери 'A':");
        // Використання лямбда-виразу для фільтрації рядків, які починаються з літери "A"
        strings.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);

        scanner.close();
    }
}
