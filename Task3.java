package Lab_2;

public class Task3 {
    public static void main(String[] args) {
        double R = 100.0;
        double r = 30.0;

        double x = 40.0;
        double y = 30.0;

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Расстояние до предмета: " + distance);

        if (distance > R) {
            System.out.println("Не обнаружен");
        } else if (distance > r) {
            System.out.println("Обнаружен");
        } else {
            System.out.println("Тревога");
        }
    }
}
