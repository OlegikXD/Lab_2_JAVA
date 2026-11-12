package Lab_2;

public class Task5 {
    public static void main(String[] args){
        if (args.length < 1) {
            System.out.println("Ошибка! Укажите целое число в параметрах командной строки.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Десятичная:        " + num);
        System.out.println("Двоичная:          " + Integer.toString(num, 2));
        System.out.println("Восьмеричная:      " + Integer.toString(num, 8));
        System.out.println("Шестнадцатеричная: " + Integer.toString(num, 16).toUpperCase());
    }
}
