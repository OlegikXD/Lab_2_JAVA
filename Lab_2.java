package Lab_2;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Lab_2 {
    public static void main(String[] args) {
        System.out.println("Привет, это лаба №2!");
    
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("=== ЗАДАНИЕ 1 ===");
        Task1.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 2 ===");
        Task2.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 3 ===");
        Task3.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 4 (тест 3 вариантов) ===");
        Task4.main(new String[]{"100", "30", "80", "80"});
        Task4.main(new String[]{"100", "30", "40", "30"});
        Task4.main(new String[]{"100", "30", "10", "10"});

        System.out.println("\n=== ЗАДАНИЕ 5 ===");
        Task5.main(new String[]{"255"});

        System.out.println("\n=== ЗАДАНИЕ 6 ===");
        Task6.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 7 ===");
        Task7.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 9 ===");
        Task9.main(new String[]{});

        System.out.println("\n=== ЗАДАНИЕ 10 ===");
        Task10.main(new String[]{});
    }
}
