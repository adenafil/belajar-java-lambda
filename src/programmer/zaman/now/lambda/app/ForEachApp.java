package programmer.zaman.now.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Ade", "Nafil", "firmansah");

        // For Loop Biasa
        for (var value : list) {
            System.out.println(value);
        }

        // ForEach dengan anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // For Each Dengan Lambda
        list.forEach(value -> System.out.println(value));

        // For Each denga lambda reference method
        list.forEach(System.out::println);

    }
}
