package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

/*
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Ade";
            }
        };

        System.out.println(simpleAction1.action("Ade"));

        SimpleAction simpleAction2 = (String name) -> {
            return "Ade Lambda";
        };

        System.out.println(simpleAction2.action("Ade Lambda"));
*/

/*
        SimpleAction simpleAction1 = (String name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = name -> "Hello" + name;
*/

        SimpleAction simpleAction1 = (String name) -> "Hello " + name;

        SimpleAction simpleAction2 = (name) -> "Hello " + name;

        SimpleAction simpleAction3 = name -> "Hello " + name;

    }
}
