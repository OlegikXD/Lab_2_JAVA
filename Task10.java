package Lab_2;

public class Task10 {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();

        System.out.println("Исходная строка: " + str);
        System.out.println("Все циклические перестановки:");

        for (int i = 0; i < n; i++) {
            String shifted = str.substring(i) + str.substring(0, i);
            System.out.println(shifted);
        }
    }
}