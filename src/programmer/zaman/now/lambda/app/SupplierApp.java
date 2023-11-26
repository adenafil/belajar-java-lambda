package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Ade Nafil Firmansah";

        String name = supplier.get();

        System.out.println(name);
    }
}
