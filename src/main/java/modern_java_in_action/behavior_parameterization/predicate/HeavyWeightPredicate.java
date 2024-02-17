package modern_java_in_action.behavior_parameterization.predicate;

import modern_java_in_action.behavior_parameterization.Apple;

public class HeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 100;
    }
}
