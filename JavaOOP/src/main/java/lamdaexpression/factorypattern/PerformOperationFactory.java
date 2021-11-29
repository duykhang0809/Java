package lamdaexpression.factorypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PerformOperationFactory {
    final static Map<String, Supplier<PerformOperation>> map = new HashMap<>();

    static {
        map.put("ODD", IsOdd::new);
        map.put("PRIME", IsPrime::new);
        map.put("PALINDROME", IsPalindrome::new);
    }

    public boolean getCondition(String condition, int number) {
        condition = condition.toUpperCase();
        if(!map.containsKey(condition)) throw new NullPointerException("There is no condition like that");
        Supplier performOperation = map.get(condition);
        if (performOperation != null) {
            return map.get(condition).get().condition(number);
        }
        throw new IllegalArgumentException("No such perform operation " + performOperation.get());
    }

}
