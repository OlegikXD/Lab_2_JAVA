package Lab_2;

public class Task6 {
    public static void printUnicodeTable(int startCode, int rows, int cols) {
        System.out.print("     ");
        for (int c = 0; c < cols; c++) {
            System.out.printf("%-2x", c);
        }
        System.out.println();

        int currentCode = startCode;
        for (int r = 0; r < rows; r++) {
            System.out.printf("%-5x", currentCode);
            for (int c = 0; c < cols; c++) {
                System.out.print((char) currentCode + " ");
                currentCode++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Таблица Кириллицы (0x0400 - 0x04FF):");
        printUnicodeTable(0x0400, 16, 16);

        System.out.println("Знаки денежных единиц (0x20A0 - 0x20BF):");
        printUnicodeTable(0x20a0, 2, 16);
    }
}
