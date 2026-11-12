package Lab_2;

public class Task7 {
    public static void main(String[] args) {
        String text = "Привет, Java 25! Тест: 123 и \u0665\u0667.";

        int totalChars = text.length();
        int letters = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int digits = 0;
        int arabicDigits = 0;
        int nonArabicDigits = 0;
        int otherChars = 0;

        for (int i = 0; i < totalChars; i++) {
            int codePoint = text.codePointAt(i);

            if (Character.isSupplementaryCodePoint(codePoint)) {
                i++;
            }

            if (Character.isLetter(codePoint)) {
                letters++;
                if (Character.isLowerCase(codePoint)) {
                    lowerCase++;
                } else if (Character.isUpperCase(codePoint)) {
                    upperCase++;
                }
            } else if (Character.isDigit(codePoint)) {
                digits++;
                if (codePoint >= '0' && codePoint <= '9') {
                    arabicDigits++;
                } else {
                    nonArabicDigits++;
                }
            } else {
                otherChars++;
            }
        }
        System.out.println("Исходная строка: " + text);
        System.out.println("Всего символов (длина): " + totalChars);
        System.out.println("Букв: " + letters + " (строчных: " + lowerCase + ", прописных: " + upperCase + ")");
        System.out.println("Цифр: " + digits + " (арабских [0-9]: " + arabicDigits + ", не арабских: " + nonArabicDigits + ")");
        System.out.println("Других символов (пробелы, знаки): " + otherChars);
    }
}