package modern_java_in_action.behavior_parameterization.predicate;

import modern_java_in_action.behavior_parameterization.Apple;
import modern_java_in_action.behavior_parameterization.Color;

public class GreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
