
public class Person {
    private String name;
    private int age;
    private Address address;
    public Person(String name, int age, String street, String city) {
    this.name = name;
    this.age = age;
    this.address = new Address(street, city);
    }
    // Non-static nested class for Address
    public class Address {
    private String street;
    private String city;
    public Address(String street, String city) {
    this.street = street;
    this.city = city;
    }
    public void displayAddress() {
    System.out.println("Address: " + street + ", " + city + "");
    }
    }
    public void displayPersonInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    address.displayAddress(); // Accessing the inner class from the outer class
    }
    // Other methods for the Person class
   } 