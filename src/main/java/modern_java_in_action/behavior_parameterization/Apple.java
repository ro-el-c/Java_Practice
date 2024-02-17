package modern_java_in_action.behavior_parameterization;

import modern_java_in_action.behavior_parameterization.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    private Color color;
    private int weight;

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;

        //filterApples(inventory, new GreenColorPredicate()); 와 같이 사용 가능
    }
}
