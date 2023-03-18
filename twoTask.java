
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class twoTask {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,1,3,1,7);
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));
        System.out.println(list.stream().mapToInt(a -> a).average().orElse(0));
    }
}