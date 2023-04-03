package LinkedList;

public class Patient {
    int data;
    Patient next;

    Patient(int data) {
        this.data = data;
        next = null;
    }

    //write set and get methods for data and next
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Patient getNext() {
        return next;
    }

    public void setNext(Patient next) {
        this.next = next;
    }


}
