package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public class MeanCalculator {
    public Map<String, Double> calculate(List<Person> people){
        return Map.of(
                "peso", meanPeso(people),
                "altura", meanAltura(people)
        );
    }

    private double meanPeso(List<Person> people){
        return people.stream().mapToDouble(Person::getPeso).average().orElse(0);

    }

    private double meanAltura(List<Person> people){
        return people.stream().mapToDouble(Person::getAltura).average().orElse(0);
    }
}
