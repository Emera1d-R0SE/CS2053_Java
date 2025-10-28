import java.util.*;

public class Lab1_StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student List Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Insert Student at Index");
            System.out.println("3. Update Student Name");
            System.out.println("4. Remove Student (by Name or Index)");
            System.out.println("5. Display Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    students.add(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter student name: ");
                    students.add(index, sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter index to update: ");
                    int index = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new name: ");
                    students.set(index, sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Remove by (1)Name or (2)Index? ");
                    int opt = sc.nextInt(); sc.nextLine();
                    if (opt == 1) {
                        System.out.print("Enter name: ");
                        students.remove(sc.nextLine());
                    } else {
                        System.out.print("Enter index: ");
                        students.remove(sc.nextInt());
                    }
                }
                case 5 -> System.out.println("Students: " + students);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
