package LinkedList;

import java.util.Scanner;

public class Menus {
    Menus() {
        int choice = menu();
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case 1:
                Patient p = insertInfo();
                LinkedList.insertAtStart(p);
                System.out.println();
                System.out.println("Patient added successfully");
                LinkedList.display();
                break;
            case 2:
                Patient p1 = insertInfo();
                LinkedList.insertAtEnd(p1);
                System.out.println("Patient added successfully");
                LinkedList.display();
                break;
            case 3:
                Patient p2 = insertInfo();
                System.out.println("Enter id after which you want to insert: ");
                int id = input.nextInt();
                LinkedList.insertAfter(p2, id);
                System.out.println("Patient added successfully");
                LinkedList.display();
                break;
            case 4:
                LinkedList.deleteAtStart();
                System.out.println();
                System.out.println("Patient deleted successfully");
                LinkedList.display();
                break;
            case 5:
                LinkedList.deleteAtEnd();
                System.out.println();
                System.out.println("Patient deleted successfully");
                LinkedList.display();
                break;
            case 6:
                System.out.println("Enter id to delete: ");
                int id1 = input.nextInt();
                LinkedList.delete(id1);
                System.out.println();
                System.out.println("Patient deleted successfully");
                LinkedList.display();
                break;
            case 7:
                System.out.print("\033[H\033[2J");
                LinkedList.display();
                break;
            case 8:
                System.exit(0);
                break;

        }
    }

    public static Patient insertInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = input.nextInt();
        System.out.println("Enter Disease: ");
        String disease = input.next();
        System.out.println("Enter treatment: ");

        String treatment = input.next();
        System.out.println("Enter cnic: ");
        int cnic = input.nextInt();
        System.out.println("Enter name: ");
        String name = input.next();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter address: ");
        String address = input.next();
        return new Patient(id, disease, treatment, cnic, name, age, address);
    }

    public static int menu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Insert at start");
        System.out.println("2. Insert at end");
        System.out.println("3. Insert after");
        System.out.println("4. Delete at start");
        System.out.println("5. Delete at end");
        System.out.println("6. Delete");
        System.out.println("7. Display");
        System.out.println("8. Exit");
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }

}
