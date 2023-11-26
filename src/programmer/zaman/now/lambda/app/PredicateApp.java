package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate <String> predicate = value -> value.isBlank();

        String name = "Ade Nafil Firmansah";

        System.out.println(predicate.test(name));
    }
}
