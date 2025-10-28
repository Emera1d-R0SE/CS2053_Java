import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Lab4_WhoisLookup {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter domain (e.g. google.com): ");
            String domain = sc.nextLine();

            Socket socket = new Socket("whois.internic.net", 43);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            out.write((domain + "\r\n").getBytes());
            out.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
