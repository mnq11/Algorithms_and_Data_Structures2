package task4;

public class AddressBook {

    public String name;
    public String address;

    public AddressBook(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}