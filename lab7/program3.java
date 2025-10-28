import java.net.*;
import java.util.Scanner;

public class Lab3_FindIP {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Your IP Address: " + local.getHostAddress());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter domain (e.g. www.google.com): ");
            String domain = sc.nextLine();

            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for (InetAddress addr : addresses)
                System.out.println(domain + " -> " + addr.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
