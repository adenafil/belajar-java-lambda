package programmer.zaman.now.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Ade");

        String name = null;

        sayHello(name);
    }

    public static void sayHello(String name) {
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("Hello " + upperName);

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(System.out::println);
//
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> upperName = optionalName.map(value -> value.toUpperCase());
//        upperName.ifPresent(System.out::println);

//        if (name != null) {
//            String upperName = name.toUpperCase();
//            System.out.println("Hello " + upperName);
//        }
    }
}
