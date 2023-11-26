package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Ade";
            }
        };

        System.out.println(simpleAction1.action());

        SimpleAction simpleAction2 = () -> {
            return "Ade Lambda";
        };

        System.out.println(simpleAction2.action());

    }
}