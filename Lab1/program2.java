//sum of all digits
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
