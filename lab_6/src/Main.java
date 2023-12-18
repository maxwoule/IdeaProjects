public class Main {
    public static void main(String[] args) {
        String octalString = "777";
        int result = octStringToInt(octalString);
        String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        int count = countNumbers(sentence);

        System.out.println("Результат: " + result);
        System.out.println("Кількість чисел у реченні: " + count);
    }
    public static int octStringToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім або нульовим");
        }

        try {
            // Використання вбудованого методу для перетворення вісімкового рядка в int
            return Integer.parseInt(s, 8);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неприпустимий символ у вісімковому числі");
        }
    }

    public static int countNumbers(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім або нульовим");
        }

        String[] words = s.split("\\s+"); // Розділити речення на слова

        int count = 0;
        for (String word : words) {
            if (word.matches("\\d+")) { // Перевірити, чи слово складається тільки з цифр
                count++;
            }
        }

        return count;
    }
}