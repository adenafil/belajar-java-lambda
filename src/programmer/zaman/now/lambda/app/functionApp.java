package programmer.zaman.now.lambda.app;

import java.util.function.Function;

public class functionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = value -> value.length();

        Integer length = functionLength.apply("Ade Nafil Firmansah");

        System.out.println(length);

        String ade = "Mamamam";
    }
}
