package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                "alice@gmail.com",
                "+02131212",
                LocalDate.of(2000, 10, 10));


        CustomerValidatorService validatorService = new CustomerValidatorService();
        validatorService.isValid(customer);


        new CustomerValidatorService().isValid(customer);

        //
    }
}
