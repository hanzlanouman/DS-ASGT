package LinkedList;

public class Patient extends Person {

    private int id;
    private String disease;
    private String treatment;

    Patient(int id, String disease, String treatment, int cnic, String name, int age, String address) {
        super(cnic, name, age, address);
        this.id = id;
        this.disease = disease;
        this.treatment = treatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String toString() {
        return "ID: " + id + " Disease: " + disease + " Treatment: " + treatment + " CNIC: " + getCnic() + " Name: " + getName() + " Age: " + getAge() + " Address: " + getAddress();
    }

}