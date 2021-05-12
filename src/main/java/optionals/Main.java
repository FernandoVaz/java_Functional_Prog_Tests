package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        final Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "Default Value");

        final Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException());

        Optional.ofNullable("Hello")
                .ifPresent(System.out::println);


        Optional.ofNullable("abc@example.com")
                .ifPresent(email -> System.out.println("Sending e-mail to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Send email to " + email),
                        () -> { System.out.println("Cannot send email"); });
        System.out.println(value);
        System.out.println(value2);
    }

}
