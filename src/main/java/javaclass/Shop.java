package javaclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Customer> customers = new ArrayList();

    public Shop() {
    }

    public void inviteCustomers() {
        this.customers.add(new Customer(1111, "Васильев", "Борис", "Борисович", "Минск", 987654321, 1212));
        this.customers.add(new Customer(123, "Борисов", "Василий ", "Васильевич", "Брест", 2122, 987654321));
        this.customers.add(new Customer(12, "Сергеев", "Григорий", "Григорьевич", "Витебск", 3333, 987654321));
        this.customers.add(new Customer(217, "Иванов", "Петр", "Иванович", "Гомель", 4434, 987654320));
        this.customers.add(new Customer(597, "Петров", "Иван", "Петрович", "Гродно", 5755, 987654321));
        this.customers.add(new Customer(9, "Григорьев", "Сергей ", "Сергеевич", "Могилев", 9666, 987654321));
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public List<Customer> sortByLastName() {
        return customers.stream().sorted(Comparator.comparing(customers -> customers.getLastName()))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomersByCardRange(int from, int to) {
        return customers.stream().filter(customer -> customer.getCardNumber() > from && customer.getCardNumber() < to)
                .collect(Collectors.toList());
    }
}
