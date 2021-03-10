package javaclass;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.inviteCustomers();

        shop.sortByLastName().forEach((customer) -> {
            System.out.println(customer);
        });

        System.out.println();

        shop.getCustomersByCardRange(2221, 7000).forEach((customer) -> {
            System.out.println(customer);
        }); // ok
    }
}
