package Lab_2;
public class Task1 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-25s %-25s%n", "Тип", "Минимум", "Максимум");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-25d %-25d%n", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d%n", "short", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d%n", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d%n", "long", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s %-25e %-25e%n", "float", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s %-25e %-25e%n", "double", Double.MIN_VALUE, Double.MAX_VALUE);
    }
}