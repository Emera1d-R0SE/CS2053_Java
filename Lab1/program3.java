//reverse number (543=345)
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reverse=0;
        while(num!=0) {
            int digit = num%10;
            reverse=reverse*10+digit;
            num/=10;
        }

        System.out.println("reverse-> " + reverse);
    }
}
