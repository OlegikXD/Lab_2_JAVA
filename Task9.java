package Lab_2;

public class Task9 {
    public static void main(String[] args) {
        String text = "Java — это язык. Изучать Java интересно, ведь на Java пишут программы.";
        String sub = "Java";

        int count = 0;
        int index = 0;

        if (!sub.isEmpty()) {
            while ((index = text.indexOf(sub, index)) != -1) {
                count++;
                index += sub.length();
            }
        }

        System.out.println("Исходная строка: " + text);
        System.out.println("Искомая подстрока: \"" + sub + "\"");
        System.out.println("Количество вхождений: " + count);
    }
}
