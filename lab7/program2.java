import java.util.*;

public class Lab2_MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Playlist Menu ---");
            System.out.println("1. Add song at beginning");
            System.out.println("2. Add song at end");
            System.out.println("3. Remove first song");
            System.out.println("4. Remove last song");
            System.out.println("5. Replace song at index");
            System.out.println("6. Display playlist");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song name: ");
                    playlist.addFirst(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter song name: ");
                    playlist.addLast(sc.nextLine());
                }
                case 3 -> {
                    if (!playlist.isEmpty()) playlist.removeFirst();
                }
                case 4 -> {
                    if (!playlist.isEmpty()) playlist.removeLast();
                }
                case 5 -> {
                    System.out.print("Enter index: ");
                    int i = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new song name: ");
                    playlist.set(i, sc.nextLine());
                }
                case 6 -> System.out.println("Playlist: " + playlist);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
