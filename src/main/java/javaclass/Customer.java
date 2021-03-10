package javaclass;

public class Customer {
    private int id;
    private String lastName;
    private String name;
    private String familyName;
    private String address;
    private int cardNumber;
    private int iban;

    public Customer() {
    }

    public Customer(int id, String lastName, String name, String familyName, String address, int cardNumber, int iban) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.familyName = familyName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.iban = iban;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getIban() {
        return this.iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public String toString() {
        return "Customer{id=" + this.id + ", lastName='" + this.lastName + "', name='" + this.name + "', familyName='" + this.familyName + "', address='" + this.address + "', cardNumber=" + this.cardNumber + ", iban=" + this.iban + "}";
    }
}

