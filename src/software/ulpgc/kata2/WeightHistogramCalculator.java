package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightHistogramCalculator implements HistogramCalculator {
    private static final int BIN_SIZE = 20;
    private final List<Person> people;

    public WeightHistogramCalculator(List<Person> people) {
        this.people = people;
    }

    @Override
    public Map<String, Integer> calculate(){
        Map<String, Integer> result = new HashMap<>();
        for(Person person : people){
            String key = toBin(person.getPeso());
            result.put(key, result.getOrDefault(key,0)+1);
        }
        return result;
    }
    private String toBin(double peso){
        return low(peso) + "-" + (high(peso));
    }

    private int high(double peso){
        return low(peso) + BIN_SIZE;
    }

    private int low (double peso){
        return (int) (peso/BIN_SIZE) * BIN_SIZE;
    }
}
