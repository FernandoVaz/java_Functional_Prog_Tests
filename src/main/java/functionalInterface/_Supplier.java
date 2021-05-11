package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getComplicatedPassword.get());
    }

    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<Long> getComplicatedPassword = () -> 2314412321412321l;
    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";

}
