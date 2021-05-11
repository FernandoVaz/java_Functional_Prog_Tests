package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal Java Function
        final Customer maria = new Customer("Maria", "993132");
        greetCustomer(maria);

        //Functional Interface (Consumer)
        greetCustomerConsumer.accept(maria);
    }


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello"
            + customer.customerName + ", thanks for registering phone number "
            + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello"
                + customer.customerName + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
