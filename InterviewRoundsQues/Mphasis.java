import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mphasis {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101,"Rahul");
        map1.put(103,"Raj");
        map1.put(106,"Chinna");
        map1.put(105,"Rahim");

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Chinna",50000.0);
        map2.put("Rahim",60000.0);
        map2.put("Raj",70000.0);
        map2.put("Rahul",20000.0);

        List<Map.Entry<String, Double>> sortedList =
                map2.entrySet()
                .stream()
                .sorted(
                    Map.Entry.<String,Double>comparingByValue().reversed()
                ).collect(Collectors.toList());

        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();
        for(Map.Entry<String, Double> entry : sortedList) {

            String name = entry.getKey();
            Double salary = entry.getValue();

             Integer id =
                     map1.entrySet()
                    .stream()
                    .filter(e -> e.getValue().equals(name))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);
            result.put(id, salary);
        }

        result.forEach((k,v) -> System.out.print(k+ "," + v.intValue() + " ")) ;
    }
}
