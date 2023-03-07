package Lab5;

import java.util.ArrayList;
import java.util.List;

import static Lab5.PairSumming.pairSumming;

public class Main {


public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        try {
            List<Integer> result = pairSumming(numbers);
            System.out.println(result);
        } catch (PairSummingException e) {
            System.out.println(e.getMessage());
        }
    }
}

