package Lab_2;

public class Task4{
    public static void main(String[] args){
        if (args.length < 4) {
            System.out.println("Ошибка! Укажите 4 числа через пробел: R r x y");
            return;
        }

        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        double y = Double.parseDouble(args[3]);

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
