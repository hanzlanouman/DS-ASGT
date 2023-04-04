package LinkedList;

public class Person {
    private int cnic;
    private String name;
    private int age;
    private String address;

    Person(int cnic, String name, int age, String address) {
        this.cnic = cnic;
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "CNIC: " + cnic + " Name: " + name + " Age: " + age + " Address: " + address;
    }


}