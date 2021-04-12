package javaclass;

public class Runner {

    private static final int LOWER_BOUND = 2221;
    private static final int UPPER_BOUND = 7000;

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.inviteCustomers();

        shop.sortByLastName().forEach(System.out::println);

        System.out.println();

        shop.getCustomersByCardRange(LOWER_BOUND, UPPER_BOUND).forEach(System.out::println);
    }
}
