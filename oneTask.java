import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class oneTask {
    public static void main(String[] args) {
        evenElim();
    }

    public static void evenElim() {
        List<Integer> arr = Arrays.asList(9, 4, 5, 3, 1, 6, 8);
        System.out.println(arr);
        Map<Boolean, List<Integer>> map = arr.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 1));
        List<List<Integer>> list = new ArrayList<>(map.values());
        System.out.println(list.get(1));
    }
}