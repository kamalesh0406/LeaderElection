import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigParser{
    public String uid;
    public String host;
    public Integer port;
    public Map<String, Integer> neighbors = new HashMap<>();

    ConfigParser(String[] args) {
        uid = args[0];
        host = args[1];
        port = Integer.parseInt(args[2]);

        List<String> neighborsDetails = Arrays.asList(args[3].split("_"));
        neighborsDetails = neighborsDetails.subList(1, neighborsDetails.size());

        for (String detail: neighborsDetails) {
            String[] detailArray = detail.split(",");
            neighbors.put(detailArray[0], Integer.parseInt(detailArray[1]));
        }
    }

}