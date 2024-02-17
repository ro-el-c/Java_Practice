package modern_java_in_action.quiz.ch2;

import modern_java_in_action.quiz.ch2.print_formatter.*;

import java.util.ArrayList;
import java.util.List;

import static modern_java_in_action.behavior_parameterization.Color.*;

public class Quiz_2_1_Main {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(RED, 100));
        inventory.add(new Apple(GREEN, 110));
        inventory.add(new Apple(GRAY, 80));
        inventory.add(new Apple(RED, 99));

        System.out.println("===== detail print formatter =====");
        prettyPrintApple(inventory, new DetailPrintFormatter());

        System.out.println();
        System.out.println("===== simple print formatter =====");
        prettyPrintApple(inventory, new SimplePrintFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, PrintFormatter formatter) {
        for (Apple apple : inventory) {
            String made = formatter.make(apple);
            System.out.println(made);
        }
    }
}
