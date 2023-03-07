package Lab7;

import java.util.HashSet;
import java.util.Set;

public class GeometricProgression {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        double base = 2;
        double commonRatio = 3;
        int numberOfElements = 5;

        for (int i = 0; i < numberOfElements; i++) {
            set.add(base * Math.pow(commonRatio, i));
        }

        System.out.println("Elements in the set: " + set);
    }
}
