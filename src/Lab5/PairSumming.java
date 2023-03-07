package Lab5;

import java.util.ArrayList;
import java.util.List;

public class PairSumming {
    public static List<Integer> pairSumming(List<Integer> numbers) throws PairSummingException {
        List<Integer> result = new ArrayList<>();
        if (numbers.size() % 2 != 0) {
            throw new OddNumberException("Input sequence should have even number of elements.");
        }
        for (int i = 0; i < numbers.size(); i += 2) {
            result.add(numbers.get(i) + numbers.get(i + 1));
        }
        return result;
    }
}
