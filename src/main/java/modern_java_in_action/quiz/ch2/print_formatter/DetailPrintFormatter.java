package modern_java_in_action.quiz.ch2.print_formatter;

import modern_java_in_action.quiz.ch2.Apple;

public class DetailPrintFormatter implements PrintFormatter {
    private static int MIN_HEAVY_WEIGHT = 100;

    @Override
    public String make(Apple apple) {
        StringBuilder sb = new StringBuilder();
        if (apple.getWeight() >= MIN_HEAVY_WEIGHT) {
            sb.append("heavy ");
        }
        sb.append(apple.getColor()).append(" apple");

        return sb.toString();
    }
}
