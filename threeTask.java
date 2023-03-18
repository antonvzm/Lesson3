import java.util.ArrayList;

public class threeTask {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("банан");
        list.add("манадарин");
        list.add("10");
        list.add("картошка");
        list.add("2");
        list.add("клюква");
        list.add("12");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                int num = Integer.parseInt(element);
                list.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(list);
    }
}
