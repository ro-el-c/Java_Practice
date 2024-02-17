package modern_java_in_action.quiz.ch2;

import modern_java_in_action.behavior_parameterization.Color;

public class Apple {
    private Color color;
    private int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
