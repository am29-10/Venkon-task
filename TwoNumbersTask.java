import java.util.Scanner;

public class TwoNumbersTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "; b = " + b);
    }
}
