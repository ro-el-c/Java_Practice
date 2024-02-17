package modern_java_in_action.quiz.ch2.print_formatter;

import modern_java_in_action.quiz.ch2.Apple;

public class SimplePrintFormatter implements PrintFormatter {
    @Override
    public String make(Apple apple) {
        return apple.getWeight() + "kg and " + apple.getColor() + " apple";
    }
}
