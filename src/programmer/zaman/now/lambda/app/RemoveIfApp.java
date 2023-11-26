package programmer.zaman.now.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Ade", "Nafil", "Firmansah"));

//        for (var name : names) {
//            if (name.length() > 5) {
//                names.remove(name);
//            }
//        }

        // Remove if anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        names.removeIf(name -> name.length() > 5);

        names.forEach(System.out::println);

    }
}
