package LinkedList;

public class ListAccess {

    public static void main(String[] args) {
        LinkedList.insertAtEnd(new Patient(1, "Cancer", "Chemotherapy", 123456789, "Ali", 25, "Karachi"));
        LinkedList.insertAtEnd(new Patient(2, "Diabetes", "insulin", 123456789, "Asad", 22, "Isb"));
//        LinkedList.insertAtEnd(new Patient(3, "Diaherrea", "medicine", 123456789, "Abdullah", 21, "abt"));
        LinkedList.insertAtStart(new Patient(4, "XYZ", "xyz medicine", 123456789, "Saad", 25, "hvn"));
        LinkedList.insertAfter(new Patient(5, "ABC", "abc medicine", 123456789, "Waqas", 19, "Doha"), 1);
//        LinkedList.deleteAtStart();
//        LinkedList.deleteAtEnd();
        LinkedList.delete(4);
        LinkedList.display();
    }
}
//CNIC NAME AGE ADDRESS