package Lab_2;

public class Task2 {
    public static void main(String args[]){
        int[] arr = {4, -2, 7, 0, -5, 12, -1, 8, 9, -3, 15, 2, -4, 6, 11, -2, 3, 1, 10, -1};
        
        double product = 1.0;
        int count = 0;

        for (int num : arr) {
            if (num < 0) {
                product *= Math.abs(num);
                count++;
            }
        }

        if (count > 0) {
            double geomMean = Math.pow(product, 1.0 / count);
            System.out.println("Количество отрицательных элементов: " + count);
            System.out.println("Среднее геометрическое: " + geomMean);
        } else {
            System.out.println("В массиве нет отрицательных элементов.");
        }
    }
}
