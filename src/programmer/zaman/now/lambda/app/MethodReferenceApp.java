package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return StringUtil.isLowerCase(value);
//            }
//        };

//        Predicate<String> predicateIsLowerCase =  value -> StringUtil.isLowerCase(value);

        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;;

        System.out.println(predicateIsLowerCase.test("ade"));
        System.out.println(predicateIsLowerCase.test("Nafil"));

        // Method Reference di parameter

        //Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("ade"));
    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;;

        System.out.println(predicateIsLowerCase.test("ade"));
        System.out.println(predicateIsLowerCase.test("Nafil"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("ade"));
        System.out.println(predicateIsLowerCase.test("mamamaHuhuhhu"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray() ) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    };

}

